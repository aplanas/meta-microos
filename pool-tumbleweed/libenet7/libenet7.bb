SUMMARY = "Library files for libenet"
DESCRIPTION = "The libenet7 package contains libraries for libenet."
LICENSE = "MIT"

PV = "1.3.17"

RPM_NAME = "libenet7-1.3.17-1.10.aarch64.rpm"
RPM_HASH = "324156d00542369f82e99cf437129c8da347d1bf9f7f3385776e400f29daac1b4f346a1156efd1a75308904932de6fe45209ae6aed9956cdbb0ea6518b9eedf7"

RPROVIDES:${PN} += "libenet.so.7()(64bit) \
libenet7 \
libenet7(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
