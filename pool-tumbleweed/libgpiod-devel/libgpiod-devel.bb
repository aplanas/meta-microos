SUMMARY = "Devel files for libgpiod"
DESCRIPTION = "The libgpiod library encapsulates the ioctl calls and data structures \
of the GPIO character devices, the latter of which superseded the \
GPIO sysfs interface in Linux 4.8. \
 \
Devel files part."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.3"

RPM_NAME = "libgpiod-devel-1.6.3-2.4.aarch64.rpm"
RPM_HASH = "bbd904f6aef3bd46af2dee085f6115ae38d0f56f3bd079036aad774baa4f0e7c29e1f2d17f756330c8da6ff4c9715964d6bb93f8957850e8750ccaf0fff478c5"

RPROVIDES:${PN} += "libgpiod-devel \
pkgconfig-libgpiod \
pkgconfig-libgpiodcxx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgpiod \
libgpiod2 \
libgpiodcxx1 \
libgpiomockup0"

inherit rpm
