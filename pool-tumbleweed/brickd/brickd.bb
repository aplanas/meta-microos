SUMMARY = "Tinkerforce Brick Daemon"
DESCRIPTION = "Brick Daemon is a small bridge between the USB port of Bricks and \
the TCP/IP socket connection to the language binding APIs."
LICENSE = "GPL-2.0-only"

PV = "2.4.4"

RPM_NAME = "brickd-2.4.4-2.1.aarch64.rpm"
RPM_HASH = "0b9cc138d389a5ed19191b291a05aac6d1e76b0e01f0e84bb50217783ff2db2c803eed51ee4e2dbfcc5d5c07963ca15340e3890a74ff07448f5db703a39dda47"

RPROVIDES:${PN} += "brickd \
config-brickd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
