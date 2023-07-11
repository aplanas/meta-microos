SUMMARY = "Tools for interacting with the linux GPIO character device"
DESCRIPTION = "The libgpiod library encapsulates the ioctl calls and data structures \
of the GPIO character devices, the latter of which superseded the \
GPIO sysfs interface in Linux 4.8. \
 \
Command-line tools part."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.3"

RPM_NAME = "libgpiod-utils-1.6.3-2.4.aarch64.rpm"
RPM_HASH = "d402c3a511397b019759f3c193ceff78670329f506f2d4883ea59e4501fb50334a88ce224004332d87b9b044ea7b8a0df5411fe01ad6046cd5cec42a08682400"

RPROVIDES:${PN} += "libgpiod \
libgpiod-utils"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/bats \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgpiod.so.2 \
libgpiodcxx.so.1 \
libgpiomockup.so.0 \
libstdc++.so.6"

inherit rpm
