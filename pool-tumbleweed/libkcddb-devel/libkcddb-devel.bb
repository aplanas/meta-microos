SUMMARY = "Development files for KDE CDDB library"
DESCRIPTION = "This package includes the development headers for libkcddb."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "libkcddb-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "ffe71ac6107153cef56b1eec9a02beeb6f1e52f81498a120d05fad8f5c2447755bdbd81eda3baacb3fa633c5bcf5708028553b1d5cf2f0e5c1b3ffb29b707009"

RPROVIDES:${PN} += "cmake-KF5Cddb \
libkcddb-devel \
libkcddb5-devel"

RDEPENDS:${PN} += "libKF5Cddb5 \
libkcddb"

inherit rpm
