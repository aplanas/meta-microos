SUMMARY = "Qt5 Widgets Addons library for Fcitx5"
DESCRIPTION = "This package provides Qt5 Widgets Addons library for Fcitx5."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.0.17"

RPM_NAME = "libFcitx5Qt5WidgetsAddons2-5.0.17-1.2.aarch64.rpm"
RPM_HASH = "5b0a6057a34f350b63b54b9dfddaede5303fb4e43f4aef2045c339bd2cdc0fa06aa757c1a5ac7b40fa1ce7bb55a8884ea6824c0312f69d647188c43890262c34"

RPROVIDES:${PN} += "libFcitx5Qt5WidgetsAddons.so.2 \
libFcitx5Qt5WidgetsAddons2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFcitx5Utils.so.2 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
