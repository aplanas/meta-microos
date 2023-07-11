SUMMARY = "Qt6 QuickDialogs2Impl library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickDialogs2Impl library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickdialogs2quickimpl-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "441ed6075b6cad661b918bccd1b1187dc0983b4536ece99e3b7bb4cac99149771722850bcf98b974fef6720df051190f03c402fef01f9641fba671300ca5057f"

RPROVIDES:${PN} += "cmake-Qt6QuickDialogs2QuickImpl \
pkgconfig-Qt6QuickDialogs2QuickImpl \
qt6-quickdialogs2quickimpl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
libQt6QuickDialogs2QuickImpl6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Quick \
qt6-qml-private-devel \
qt6-quickcontrols2impl-private-devel \
qt6-quickdialogs2utils-private-devel \
qt6-quicktemplates2-private-devel"

inherit rpm
