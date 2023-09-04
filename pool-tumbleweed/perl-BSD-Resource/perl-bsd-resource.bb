SUMMARY = "BSD process resource limit and priority functions"
DESCRIPTION = "BSD process resource limit and priority functions"
LICENSE = "Artistic-2.0 | LGPL-2.0"

PV = "1.2911"

RPM_NAME = "perl-BSD-Resource-1.2911-1.33.aarch64.rpm"
RPM_HASH = "6d91e25c84766183457ec0ec7c297c082f13741b4a5f64887b5b812a842c6c6888e1a190d6b6fef3b55b0a5c6a4f48e0ac710477aa28010e0d7229dbf2e6bc9e"

RPROVIDES:${PN} += "perl-BSD--Resource \
perl-BSD-Resource"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
