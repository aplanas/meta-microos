SUMMARY = "Qt 6 LabsAnimation library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsAnimation library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-labsanimation-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "9ce9ca0fecbbc72e5e3bd85ff02be15ed8b1145172c9c09c70c07efd0ed4e0ce289379c76b0e2c56ffd1d25aed7021146b95b1d4f31de50f59a5b378bdc34162"

RPROVIDES:${PN} += "cmake-Qt6LabsAnimation \
pkgconfig-Qt6LabsAnimation \
qt6-labsanimation-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt6LabsAnimation6 \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
qt6-qml-private-devel \
qt6-quick-private-devel"

inherit rpm
