SUMMARY = "C++library for interacting with the linux GPIO character device"
DESCRIPTION = "The libgpiod library encapsulates the ioctl calls and data structures \
of the GPIO character devices, the latter of which superseded the \
GPIO sysfs interface in Linux 4.8. \
 \
C++ library part."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.3"

RPM_NAME = "libgpiodcxx1-1.6.3-2.3.aarch64.rpm"
RPM_HASH = "38ed36bd669806e4dad36596bcb20f93b9334eb56cc4ff71a7cf3c0ed0906ed59fd08da70d77fcab544fa1aaa6e4698af0715ea6c13205ed1dc82b57c172fd33"

RPROVIDES:${PN} += "libgpiodcxx.so.1()(64bit) \
libgpiodcxx1 \
libgpiodcxx1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgpiod.so.2()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
