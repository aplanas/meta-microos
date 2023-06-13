SUMMARY = "Create cabinet (.cab) files"
DESCRIPTION = "LCAB is a small program for linux that creates an uncompressed MS Cabinet \
File from a set of input files."
LICENSE = "GPL-2.0-or-later"

PV = "1.0b12"

RPM_NAME = "lcab-1.0b12-2.9.aarch64.rpm"
RPM_HASH = "5191e48de1ba03167e4ecb8e21e239663770486d91dc8504d513ed658fdaaecdc71132e10fe0a5816e0573b69a319ea68178a0b5dcd68b1176ef18d9552dc42c"

RPROVIDES:${PN} += "lcab \
lcab(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
