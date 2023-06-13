SUMMARY = "C library for interacting with the linux GPIO character device"
DESCRIPTION = "The libgpiod library encapsulates the ioctl calls and data structures \
of the GPIO character devices, the latter of which superseded the \
GPIO sysfs interface in Linux 4.8. \
 \
C library part."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.3"

RPM_NAME = "libgpiod2-1.6.3-2.3.aarch64.rpm"
RPM_HASH = "d470551fbd6d98c321c90c6ee1976b6e2226a970032f4df0c286cb62b1e06733b48ef6f9b88a7e177ef7b6c9836d78db9792a2d9b42643c19eafca9d218b39a2"

RPROVIDES:${PN} += "libgpiod.so.2()(64bit) \
libgpiod2 \
libgpiod2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
