SUMMARY = "Qt 6 QuickTimeline library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickTimeline library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quicktimeline-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "db3aab534b49a8a479f8b72ab877a63c894fbf77c9bd5353f9d161fc5601fdd99595a24bd8db6110dee92b859c36a0699547fa55c382896e1f80ed85de6f6e77"

RPROVIDES:${PN} += "cmake-Qt6QuickTimeline \
pkgconfig-Qt6QuickTimeline \
qt6-quicktimeline-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
cmake-Qt6Quick \
libQt6QuickTimeline6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick"

inherit rpm
