SUMMARY = "Driver for Airspy"
DESCRIPTION = "Library to run Airspy SDR receiver."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.10"

RPM_NAME = "libairspy0-1.0.10-1.8.aarch64.rpm"
RPM_HASH = "2ea91865f63952633b918bf6aecf44501b85cd23d801a7218809dc98aa95ba41fa1609d5a6ec8efb3472cffe7056b9876719327c2d177c5567d1fba5d0cc43c2"

RPROVIDES:${PN} += "libairspy.so.0 \
libairspy0"

RDEPENDS:${PN} += "/sbin/ldconfig \
airspy-udev \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
