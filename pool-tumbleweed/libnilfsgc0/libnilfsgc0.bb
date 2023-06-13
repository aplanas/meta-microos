SUMMARY = "Garbage collection library for interacting with nilfs"
DESCRIPTION = "This package contains shared garbage collection library needed for some \
applications to interface with nilfs"
LICENSE = "GPL-2.0-only"

PV = "2.2.9"

RPM_NAME = "libnilfsgc0-2.2.9-1.4.aarch64.rpm"
RPM_HASH = "f933ef5624e1bf6d0872fba336d6f2e56df5716600aa5f81168de4211a51ce1945d88adb270efef73f1fa8440c2d3ca01b9ad8ab1fd57b836693ec0f22a81a9c"

RPROVIDES:${PN} += "libnilfsgc.so.0()(64bit) \
libnilfsgc0 \
libnilfsgc0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libnilfs.so.0()(64bit)"

inherit rpm
