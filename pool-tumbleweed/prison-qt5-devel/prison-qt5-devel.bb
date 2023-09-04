SUMMARY = "Development files for prison-qt5, a barcode abstraction library"
DESCRIPTION = "Development files for prison, a barcode abstraction layer library providing \
uniform access to generation of barcodes with data."
LICENSE = "MIT"

PV = "5.109.0"

RPM_NAME = "prison-qt5-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "2c9895dfd52a3ff93bb69298433fe81bbfb54ecf4bf344515bcb51c9bdcc7188b64b6c3b61cf7a407e46f8b0a5729a9f50bea52ed2d5bc85dc9b47156526ca7e"

RPROVIDES:${PN} += "cmake-KF5Prison \
prison-qt5-devel"

RDEPENDS:${PN} += "cmake-Qt5Gui \
libKF5Prison5"

inherit rpm
