SUMMARY = "Development files for fcitx5-qt"
DESCRIPTION = "This package provides development files for fcitx5-qt."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.0.17"

RPM_NAME = "fcitx5-qt-devel-5.0.17-1.2.aarch64.rpm"
RPM_HASH = "7669dc37bb25cb3b14070bd75be0689b5cde662762db437b9864238ba50a411c160fb771f245ddee5f07d12c58da7c83fba35d0e24dcc345cff0f5d07a7e9659"

RPROVIDES:${PN} += "cmake(Fcitx5Qt5DBusAddons) \
cmake(Fcitx5Qt5WidgetsAddons) \
cmake(Fcitx5Qt6DBusAddons) \
fcitx5-qt-devel \
fcitx5-qt-devel(aarch-64)"

RDEPENDS:${PN} += "fcitx5-qt5 \
fcitx5-qt6 \
libFcitx5Qt5DBusAddons1 \
libFcitx5Qt5WidgetsAddons2 \
libFcitx5Qt6DBusAddons1"

inherit rpm
