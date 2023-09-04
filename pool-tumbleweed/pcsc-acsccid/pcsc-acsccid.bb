SUMMARY = "PCSC Driver for ACS CCID Based Smart Card Readers"
DESCRIPTION = "This package contains a ACS USB CCID (Chip/Smart Card Interface \
Devices) driver. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.10"

RPM_NAME = "pcsc-acsccid-1.1.10-1.1.aarch64.rpm"
RPM_HASH = "94aa7526a35b8773fa4df265cf77457af30bbffe0139b36cc6f7d9b675f7780d629c0a8084cceef493e88adbc6b069ba09ce6e353cfc7a792f3c674fc8e5724c"

RPROVIDES:${PN} += "libacsccid.so \
pcsc-acsccid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0 \
pcsc-lite"

inherit rpm
