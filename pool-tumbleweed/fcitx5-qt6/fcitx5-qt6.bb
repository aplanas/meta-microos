SUMMARY = "Qt6 IM module for Fcitx5"
DESCRIPTION = "Qt6 IM module for Fcitx5."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.0.17"

RPM_NAME = "fcitx5-qt6-5.0.17-1.3.aarch64.rpm"
RPM_HASH = "2d83b9464e6db7988e29176bb734f79e996f9be448153c35820f16ecf93fac8ac6d31371d47f29f6c1dda94c6c54094c4fba873f70e7e0e239e619c638034369"

RPROVIDES:${PN} += "fcitx-qt6 \
fcitx5-qt6 \
libfcitx5platforminputcontextplugin.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFcitx5Qt6DBusAddons.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxcb.so.1 \
libxkbcommon.so.0"

inherit rpm
