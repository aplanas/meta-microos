SUMMARY = "Qt6 QuickDialogs2Impl library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickDialogs2Impl library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickdialogs2quickimpl-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "cd599512cbb7594da8014b54021e6c381791c182d60bf0baec0e899e6850c73e1baab62e9a6c3e06fda216a320323e8a1dacdaabbac93fef92e926e8320285ff"

RPROVIDES:${PN} += "cmake(Qt6QuickDialogs2QuickImpl) \
pkgconfig(Qt6QuickDialogs2QuickImpl) \
qt6-quickdialogs2quickimpl-devel \
qt6-quickdialogs2quickimpl-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Gui) \
libQt6QuickDialogs2QuickImpl6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Gui) \
pkgconfig(Qt6Quick) \
qt6-qml-private-devel \
qt6-quickcontrols2impl-private-devel \
qt6-quickdialogs2utils-private-devel \
qt6-quicktemplates2-private-devel"

inherit rpm
