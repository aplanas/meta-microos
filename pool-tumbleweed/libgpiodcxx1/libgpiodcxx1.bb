SUMMARY = "C++library for interacting with the linux GPIO character device"
DESCRIPTION = "The libgpiod library encapsulates the ioctl calls and data structures \
of the GPIO character devices, the latter of which superseded the \
GPIO sysfs interface in Linux 4.8. \
 \
C++ library part."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.3"

RPM_NAME = "libgpiodcxx1-1.6.3-2.4.aarch64.rpm"
RPM_HASH = "d2cd14b8836456c5be85681d8293c868117d4ab3b3a54c74b3923262f11ba67a63458b84ec99503b2c6624439578302411e007536a5bb15614985eecf97d2311"

RPROVIDES:${PN} += "libgpiodcxx.so.1 \
libgpiodcxx1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgpiod.so.2 \
libstdc++.so.6"

inherit rpm
