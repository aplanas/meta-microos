SUMMARY = "Tinkerforce Brick Daemon"
DESCRIPTION = "Brick Daemon is a small bridge between the USB port of Bricks and \
the TCP/IP socket connection to the language binding APIs."
LICENSE = "GPL-2.0-only"

PV = "2.4.4"

RPM_NAME = "brickd-2.4.4-1.2.aarch64.rpm"
RPM_HASH = "7252c34a8f3ffc4bbacfd155d120cf0d9a58844d8644e6d806390fa719b9711ee876451791247d7961a8a9f142e40436899dcad314615454ee87334ca091a5b4"

RPROVIDES:${PN} += "brickd brickd(aarch-64) config(brickd)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libusb-1.0.so.0()(64bit)"

inherit rpm
