SUMMARY = "Qt 6 QuickTest library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickTest library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quicktest-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "dd39d66a025c447e078b2af481fb8ed736b013e3cce8ea9ac4f68912523ae05865903409d42c7ef616f34950aa6d666db20d14ac4f8437798e86c57d63bc9ebd"

RPROVIDES:${PN} += "cmake-Qt6QuickTest \
pkgconfig-Qt6QuickTest \
qt6-quicktest-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Quick \
cmake-Qt6Test \
libQt6QuickTest6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Test \
qt6-qml-private-devel \
qt6-quick-private-devel"

inherit rpm
