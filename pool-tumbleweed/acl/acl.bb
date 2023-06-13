SUMMARY = "Commands for Manipulating POSIX Access Control Lists"
DESCRIPTION = "getfacl and setfacl commands for retrieving and setting POSIX access \
control lists."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.3.1"

RPM_NAME = "acl-2.3.1-2.12.aarch64.rpm"
RPM_HASH = "f852f0d712a7116cf0e395a4a4b4b90dd5eb7719c23f919da4f06c58ea6cbe5d1080b0d32ecd44b1acc794bbb014968849dd443dfb92c8b9f96edbc6f164b6bb"

RPROVIDES:${PN} += "acl \
acl(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libacl.so.1()(64bit) \
libacl.so.1(ACL_1.0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
