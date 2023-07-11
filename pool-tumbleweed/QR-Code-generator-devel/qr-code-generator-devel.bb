SUMMARY = "Development files for QR code generator"
DESCRIPTION = "Development files, headers/libs for QR code generator"
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "QR-Code-generator-devel-1.6.0-1.13.aarch64.rpm"
RPM_HASH = "7c8bc0cb5a3c49d83ca6ff02b9379cd9218e22c390b8ddaf369deeab9bb8d5b1bb092250c2ba5a712da0d32185aadccc3a4a738c2f931d1e413eda0abf78e133"

RPROVIDES:${PN} += "QR-Code-generator-devel \
qrcodegen-devel"

RDEPENDS:${PN} += "libqrcodegen1 \
libqrcodegencpp1"

inherit rpm
