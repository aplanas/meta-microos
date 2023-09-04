SUMMARY = "Development files for fcitx5-qt"
DESCRIPTION = "This package provides development files for fcitx5-qt."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.1.0"

RPM_NAME = "fcitx5-qt-devel-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "88515919764186a6fc010ba4f2820cc7d7f28aece17188de397f068316aa756126e18a25c19321cf469d49141a60f10aac65b38678971dc0c672cf449a5bad26"

RPROVIDES:${PN} += "cmake-Fcitx5Qt5DBusAddons \
cmake-Fcitx5Qt5WidgetsAddons \
cmake-Fcitx5Qt6DBusAddons \
fcitx5-qt-devel"

RDEPENDS:${PN} += "fcitx5-qt5 \
fcitx5-qt6 \
libFcitx5Qt5DBusAddons1 \
libFcitx5Qt5WidgetsAddons2 \
libFcitx5Qt6DBusAddons1"

inherit rpm
