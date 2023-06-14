SUMMARY = "Devel files for libgpiod"
DESCRIPTION = "The libgpiod library encapsulates the ioctl calls and data structures \
of the GPIO character devices, the latter of which superseded the \
GPIO sysfs interface in Linux 4.8. \
 \
Devel files part."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.3"

RPM_NAME = "libgpiod-devel-1.6.3-2.3.aarch64.rpm"
RPM_HASH = "ad03778c660ab8f9b59e2e96554ccb6d4d8d1277ec087021acc631b45e6aa4844ef0c070a3d6f121869bfc7ed716b236a6c2a0d4cf31b36d2e0cec5bb2f2abc4"

RPROVIDES:${PN} += "libgpiod-devel \
pkgconfig-libgpiod \
pkgconfig-libgpiodcxx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgpiod \
libgpiod2 \
libgpiodcxx1 \
libgpiomockup0"

inherit rpm
