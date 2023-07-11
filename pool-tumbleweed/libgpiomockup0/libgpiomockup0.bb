SUMMARY = "C library for interacting with the linux GPIO character device"
DESCRIPTION = "The libgpiod library encapsulates the ioctl calls and data structures \
of the GPIO character devices, the latter of which superseded the \
GPIO sysfs interface in Linux 4.8. \
 \
GPIO mockup library part."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.3"

RPM_NAME = "libgpiomockup0-1.6.3-2.4.aarch64.rpm"
RPM_HASH = "49bb1ba8db1f877614fa3c6899c4fc8df12a6748babb672c73552e26827586697cefb148dc788cee5bb0b6075ce93f51712321410c94d14b001df9708094f263"

RPROVIDES:${PN} += "libgpiomockup.so.0 \
libgpiomockup0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkmod.so.2 \
libudev.so.1"

inherit rpm
