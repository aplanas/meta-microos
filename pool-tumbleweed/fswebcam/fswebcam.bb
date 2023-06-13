SUMMARY = "Tiny and flexible webcam program"
DESCRIPTION = "Tiny and flexible webcam program for capturing images from a V4L1/V4L2 \
device, and overlaying a caption or image."
LICENSE = "GPL-2.0-only"

PV = "20200725"

RPM_NAME = "fswebcam-20200725-1.11.aarch64.rpm"
RPM_HASH = "4cf2daa523ddb2847e1393dc1a94f44712a3cd67893883b20b9863d59856bab25a9813a749e01a41d456a1a64ad5a8b7984b923068520867ec12235475763c23"

RPROVIDES:${PN} += "fswebcam \
fswebcam(aarch-64)"

RDEPENDS:${PN} += "gd \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgd.so.3()(64bit)"

inherit rpm
