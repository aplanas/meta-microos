SUMMARY = "Development files for fcitx5-qt"
DESCRIPTION = "This package provides development files for fcitx5-qt."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.0.17"

RPM_NAME = "fcitx5-qt-devel-5.0.17-1.4.aarch64.rpm"
RPM_HASH = "bd40be7edff32fb61fcb5f6c7c9460dcef21e17435366b020b1e674c115ecac6c7578eecdbd2e57b15ed85073f99aa182f393362471a317d03172532421ce490"

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
