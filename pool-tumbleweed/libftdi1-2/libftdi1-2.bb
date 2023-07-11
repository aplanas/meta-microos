SUMMARY = "Library to program and control the FTDI USB controller"
DESCRIPTION = "Library to program and control the FTDI USB controller. \
This library is used by many programs accessing FTDI USB-to-RS232 converters."
LICENSE = "LGPL-2.1-only"

PV = "1.5.12+git.0684c1b"

RPM_NAME = "libftdi1-2-1.5.12+git.0684c1b-2.2.aarch64.rpm"
RPM_HASH = "5c918578e647adc41cfb20eb88dd834a6c75502a740b904785c1ef147d815f79f07fed76ef51646e157c8a9ccce7907a776d13f6e4ce251fe5dab330d6f3d63e"

RPROVIDES:${PN} += "libftdi1-2 \
libftdi1.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
