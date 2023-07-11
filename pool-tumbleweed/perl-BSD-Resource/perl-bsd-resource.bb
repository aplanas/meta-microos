SUMMARY = "BSD process resource limit and priority functions"
DESCRIPTION = "BSD process resource limit and priority functions"
LICENSE = "Artistic-2.0 | LGPL-2.0"

PV = "1.2911"

RPM_NAME = "perl-BSD-Resource-1.2911-1.32.aarch64.rpm"
RPM_HASH = "4cb3109e2dba45666f6ab35f4db402efdb084ab6c500f6aceb5b723eb3331fa3e84e3f285e728f3a0a6e243691fe87152fafdafc32e186676163994b2dbe6e37"

RPROVIDES:${PN} += "perl-BSD--Resource \
perl-BSD-Resource"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
