SUMMARY = "Development package for qtmpris"
DESCRIPTION = "Header files and libraries for qtmpris."
LICENSE = "LGPL-2.1+"

PV = "1.0.6"

RPM_NAME = "qtmpris-devel-1.0.6-2.8.aarch64.rpm"
RPM_HASH = "0182923013feb2a8221c6d4d063385b4a12ec3d2773110509547e1c0fd3fd5210be3ff23e6d667c0060b0d7168ea56133ddfd4e147b17edf2673772a5b595fdd"

RPROVIDES:${PN} += "pkgconfig-mpris-qt5 \
qtmpris-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmpris-qt5-1 \
pkgconfig-Qt5Core \
pkgconfig-Qt5DBus"

inherit rpm
