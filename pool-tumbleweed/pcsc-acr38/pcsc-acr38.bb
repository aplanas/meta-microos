SUMMARY = "PC/SC IFD Handler for the ACR38 Smart Card Reader"
DESCRIPTION = "This package contains a driver for the ACR 38 smart card reader \
produced by ACS. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package."
LICENSE = "GPL-2.0+"

PV = "1.7.11"

RPM_NAME = "pcsc-acr38-1.7.11-7.25.aarch64.rpm"
RPM_HASH = "9dfe864bf0156fc28e0f46b1bb8d9f9d208c3263071c3280755709771947a2be8f1b28d3253f6eb0d50d9b745ed13c546a04e7b451e9867d1d0ad75e23c9ad3d"

RPROVIDES:${PN} += "pcsc-acr38"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-0.1.so.4 \
pcsc-lite"

inherit rpm
