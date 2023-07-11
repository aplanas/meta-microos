SUMMARY = "Devel files for python39-PyQt6-NetworkAuth"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python39-PyQt6-NetworkAuth"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python39-PyQt6-NetworkAuth-devel-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "7452f9da32aad464574e46fbf9e0ae516e639a32f040906d7fc4ad4ed38dfa91358c06660e72d8ddcca04e2f5fc229f65200f0109b82d806652d53e0b692fe86"

RPROVIDES:${PN} += "python39-PyQt6-NetworkAuth-devel"

RDEPENDS:${PN} += "python39-PyQt6-devel"

inherit rpm
