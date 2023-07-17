SUMMARY = "Development files for prison-qt5, a barcode abstraction library"
DESCRIPTION = "Development files for prison, a barcode abstraction layer library providing \
uniform access to generation of barcodes with data."
LICENSE = "MIT"

PV = "5.108.0"

RPM_NAME = "prison-qt5-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "95a6811a2ae2fa4722a861bf512c6544af074150f926b36370e5d6321061fd0be06d2fc4385ced6559703acf77c2134d0be548431f38b9eae2a97298b38424e2"

RPROVIDES:${PN} += "cmake-KF5Prison \
prison-qt5-devel"

RDEPENDS:${PN} += "cmake-Qt5Gui \
libKF5Prison5"

inherit rpm
