SUMMARY = "Development files for fcitx5-qt"
DESCRIPTION = "This package provides development files for fcitx5-qt."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.0.16"

RPM_NAME = "fcitx5-qt-devel-5.0.16-1.7.aarch64.rpm"
RPM_HASH = "c88b20aaa61fef2d7ccf07b5eac044643a54b0e49a41d68da0e56f38d563d1bc52f16b82e6a8d2fe68104cebb3fd76b62eedf479caf004c28deda7a5971699f4"

RPROVIDES:${PN} += "cmake(Fcitx5Qt5DBusAddons) cmake(Fcitx5Qt5WidgetsAddons) cmake(Fcitx5Qt6DBusAddons) fcitx5-qt-devel fcitx5-qt-devel(aarch-64)"
RDEPENDS:${PN} += "fcitx5-qt5 fcitx5-qt6 libFcitx5Qt5DBusAddons1 libFcitx5Qt5WidgetsAddons2 libFcitx5Qt6DBusAddons1"

inherit rpm
