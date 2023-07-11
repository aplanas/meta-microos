SUMMARY = "Development files for fcitx5-qt"
DESCRIPTION = "This package provides development files for fcitx5-qt."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.0.17"

RPM_NAME = "fcitx5-qt-devel-5.0.17-1.3.aarch64.rpm"
RPM_HASH = "e605533e1f91b7f109b4623f1f4973f06bb753230536180be8f48628c1c1971b0d9d2bbd65df27ec9a80315bede1b8dbf275649e47da8d78befdd122bb869cc9"

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
