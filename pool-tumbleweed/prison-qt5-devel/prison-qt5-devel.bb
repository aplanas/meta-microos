SUMMARY = "Development files for prison-qt5, a barcode abstraction library"
DESCRIPTION = "Development files for prison, a barcode abstraction layer library providing \
uniform access to generation of barcodes with data."
LICENSE = "MIT"

PV = "5.107.0"

RPM_NAME = "prison-qt5-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "cb423f6ce6cdefa20a6f0eaa245433e3ce2bded67d2dfbf9d1e4b2c504c91861750d97865d5b6b6bba3b3c2cda076dcecb365210744782376bced46b1b53d81f"

RPROVIDES:${PN} += "cmake-KF5Prison \
prison-qt5-devel"

RDEPENDS:${PN} += "cmake-Qt5Gui \
libKF5Prison5"

inherit rpm
