SUMMARY = "Deepin Shortcut Viewer"
DESCRIPTION = "The program displays a shortcut key window when a JSON data is passed."
LICENSE = "GPL-3.0-or-later"

PV = "5.0.6"

RPM_NAME = "deepin-shortcut-viewer-5.0.6-1.3.aarch64.rpm"
RPM_HASH = "613e68775e4e1ebaca1e9f7b85ae0827dd54c96e07dc3f4a4927009a28cb3d4a930d049b953a76221b8ff468a885eb073ea83230b60461519e9ff27a5f6e793b"

RPROVIDES:${PN} += "bundled-CuteLogger \
deepin-shortcut-viewer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdtkcore.so.5 \
libdtkgui.so.5 \
libdtkwidget.so.5 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
