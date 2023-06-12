SUMMARY = "Glade catalog for the TN3270 terminal emulator library"
DESCRIPTION = "This package provides a catalog for Glade to allow the use of V3270 \
widgets in Glade."
LICENSE = "LGPL-3.0-only"

PV = "5.4"

RPM_NAME = "glade-catalog-v3270-5.4-1.9.aarch64.rpm"
RPM_HASH = "c4d0b0104cf97527a529817b9fe88ecfd4c3e06731ff6254416d0da0a27fadad4a8c702a91cf676fa57ade203038897f73cbc492800793b3deab4c3da2e85b38"

RPROVIDES:${PN} += "glade-catalog-v3270 \
glade-catalog-v3270(aarch-64)"
RDEPENDS:${PN} += "glade"

inherit rpm
