SUMMARY = "(Re)name a sub"
DESCRIPTION = "This module has only one function, which is also exported by default:"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.27"

RPM_NAME = "perl-Sub-Name-0.27-1.3.aarch64.rpm"
RPM_HASH = "43b3d329a745687a9d2098a1d5254c4a1838d10882fb1247374d4307d2845d6b447fb6009e409c32db1775130f5b3d1509bab807e4edf89aa134f07e115ebedc"

RPROVIDES:${PN} += "perl-Sub--Name \
perl-Sub-Name"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
