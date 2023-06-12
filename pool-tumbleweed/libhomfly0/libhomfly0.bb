SUMMARY = "Library to compute the homfly polynomial of a link"
DESCRIPTION = "A library to compute the homfly polynomial of a link."
LICENSE = "SUSE-Public-Domain"

PV = "1.02r6"

RPM_NAME = "libhomfly0-1.02r6-1.2.aarch64.rpm"
RPM_HASH = "11895d91a03e5ea1d31957cfb725b2b1187d84ec344d676bc046b103c4ae66fbf091dddd898e9a21c2075e05c06e6fc8c903c94b143c871932010deda76dd70a"

RPROVIDES:${PN} += "libhomfly.so.0()(64bit) \
libhomfly0 \
libhomfly0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgc.so.1()(64bit)"

inherit rpm
