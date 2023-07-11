SUMMARY = "PCSC Driver for ACS CCID Based Smart Card Readers"
DESCRIPTION = "This package contains a ACS USB CCID (Chip/Smart Card Interface \
Devices) driver. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.9"

RPM_NAME = "pcsc-acsccid-1.1.9-1.2.aarch64.rpm"
RPM_HASH = "2e606bc36d5b3a00858b7683bbda26910d2d8216c77e6a72afd2b8e894fee2384cc182bd1e1d6ad8b944969744886afa2344717287b3d48fa6444a3b39b940fc"

RPROVIDES:${PN} += "libacsccid.so \
pcsc-acsccid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0 \
pcsc-lite"

inherit rpm
