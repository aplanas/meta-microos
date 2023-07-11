SUMMARY = "Libkkc input method support for Fcitx5"
DESCRIPTION = "This package provides libkkc input method support for Fcitx5."
LICENSE = "GPL-3.0-or-later"

PV = "5.0.12"

RPM_NAME = "fcitx5-kkc-5.0.12-1.2.aarch64.rpm"
RPM_HASH = "689edb9bfaf4146b461a95fffbd5711c8aec9c32a3d98136809e2deb5295f0d57a41a9b4752e1c74b47f43c7ff332cdec5f2545716ecbee59c145eb403265df7"

RPROVIDES:${PN} += "fcitx-kkc \
fcitx5-kkc \
libfcitx5-kkc-config.so"

RDEPENDS:${PN} += "fcitx5 \
kkc-data \
ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Core.so.7 \
libFcitx5Qt5WidgetsAddons.so.2 \
libFcitx5Utils.so.2 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libkkc.so.2 \
libstdc++.so.6"

inherit rpm
