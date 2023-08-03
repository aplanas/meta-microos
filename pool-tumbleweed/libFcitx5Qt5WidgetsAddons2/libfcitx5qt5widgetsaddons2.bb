SUMMARY = "Qt5 Widgets Addons library for Fcitx5"
DESCRIPTION = "This package provides Qt5 Widgets Addons library for Fcitx5."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.0.17"

RPM_NAME = "libFcitx5Qt5WidgetsAddons2-5.0.17-1.4.aarch64.rpm"
RPM_HASH = "a312ae1168826674fa687665c4b8907bc22d0d9572cead25ef4ca2b53cac75603b61d88b84fc6269667c2cfac9ee8914c27c7c3e75817b94ba5b581f693c9b55"

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
