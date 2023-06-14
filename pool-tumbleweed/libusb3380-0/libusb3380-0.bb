SUMMARY = "USB3380 abstraction layer for libusb"
DESCRIPTION = "USB3380 abstraction layer for libusb."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20190126"

RPM_NAME = "libusb3380-0-0.0.0+git.20190126-2.6.aarch64.rpm"
RPM_HASH = "50d124a4b1d7df62125b796c76c243664dd4b47c59aa4642492d4cbb775b1e90a44df7d619340fc10bb8ff6dcb78c01e33c3b63bd86d0681b97dc5e04b256268"

RPROVIDES:${PN} += "libusb3380-0 \
libusb3380.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
