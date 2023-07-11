SUMMARY = "PCSC Driver for CCID Based Smart Card Readers and GemPC Twin Serial Reader"
DESCRIPTION = "This package contains a generic USB CCID (Chip/Smart Card Interface \
Devices) driver. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.2"

RPM_NAME = "pcsc-ccid-1.5.2-1.4.aarch64.rpm"
RPM_HASH = "573e5629c39cb6785424d2f7c3c81336f5b0106cd3902038f6b1b16c3e3754dd3384940fc7b979cb8a0953440589ab9fb396253f8e66996bb9f08b10691a6663"

RPROVIDES:${PN} += "config-pcsc-ccid \
libccid.so \
libccidtwin.so \
pcsc-ccid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0 \
pcsc-lite"

inherit rpm
