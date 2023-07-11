SUMMARY = "PC/SC IFD Handler for the ACR38 Smart Card Reader"
DESCRIPTION = "This package contains a driver for the ACR 38 smart card reader \
produced by ACS. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package."
LICENSE = "GPL-2.0+"

PV = "1.7.11"

RPM_NAME = "pcsc-acr38-1.7.11-7.26.aarch64.rpm"
RPM_HASH = "e1bf028695fa169961ac34e57118d313dcde137723f856fcf291e7414413afd337a41eee8fc779ecc6f44fd06ec1c665b093e44284580356c8de9b89e4d8a88b"

RPROVIDES:${PN} += "pcsc-acr38"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-0.1.so.4 \
pcsc-lite"

inherit rpm
