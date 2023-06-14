SUMMARY = "Development files for QR code generator"
DESCRIPTION = "Development files, headers/libs for QR code generator"
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "QR-Code-generator-devel-1.6.0-1.12.aarch64.rpm"
RPM_HASH = "a3ae53812b39fabb88c758f3ac74fff67523995a54594efdd50d4726e094f3045a94b5b386d3de1891d4ec1bc7678a9330895de899749e96d5d90156074645c0"

RPROVIDES:${PN} += "QR-Code-generator-devel \
qrcodegen-devel"

RDEPENDS:${PN} += "libqrcodegen1 \
libqrcodegencpp1"

inherit rpm
