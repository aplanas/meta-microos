SUMMARY = "Tinkerforce Brick Daemon"
DESCRIPTION = "Brick Daemon is a small bridge between the USB port of Bricks and \
the TCP/IP socket connection to the language binding APIs."
LICENSE = "GPL-2.0-only"

PV = "2.4.4"

RPM_NAME = "brickd-2.4.4-1.3.aarch64.rpm"
RPM_HASH = "376d6af157ab48ca26a2183feea3f3882dd0f6d60d0b4b9d2e48b5912c4c6be5e98a798f2c238c12c3d0f2aee0aa044d78984f1a262abbd1d23566faf80707d9"

RPROVIDES:${PN} += "brickd \
config-brickd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
