SUMMARY = "Documentation for qt6-opcua in QCH format"
DESCRIPTION = "This package contains documentation for qt6-opcua in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-opcua-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "4125b1ec7bb5fd29c94116d19d1e7e519a6a48743fedd798d1cd095e5a5d400b9837645ec55e36fe081ba5bb98f710842a91536a9283ff15f94bc74ef10b4349"

RPROVIDES:${PN} += "qt6-opcua-docs-qch"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
