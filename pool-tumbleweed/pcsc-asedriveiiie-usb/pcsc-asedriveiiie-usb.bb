SUMMARY = "ASEDrive IIIe USB Smart Card Reader Driver"
DESCRIPTION = "This package contains a driver for the ASEDrive IIIe USB smart card \
reader. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package."
LICENSE = "BSD-3-Clause"

PV = "3.7"

RPM_NAME = "pcsc-asedriveiiie-usb-3.7-11.13.aarch64.rpm"
RPM_HASH = "4665bbb9ed6704c02b16fa9ed895c20b6fd850811c5b3bee1b70b984c13c4173e0a9f0e51d0a3642c69a33862c0242156f19f38bdce5bf8bce14c20ddb1a74b1"

RPROVIDES:${PN} += "libASEDriveIIIe-USB.so \
pcsc-asedriveiiie-usb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-0.1.so.4 \
pcsc-lite"

inherit rpm
