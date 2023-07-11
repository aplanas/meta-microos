SUMMARY = "Qt5 Widgets Addons library for Fcitx5"
DESCRIPTION = "This package provides Qt5 Widgets Addons library for Fcitx5."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.0.17"

RPM_NAME = "libFcitx5Qt5WidgetsAddons2-5.0.17-1.3.aarch64.rpm"
RPM_HASH = "4d6f812d39550e1eb4f5dd28d75baa023345494a69a39b59dc27edc43522c20c236eb6d253ed7bd90ac638cef96265f2556c7724bf7d6ceab419260ea672b0a9"

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
