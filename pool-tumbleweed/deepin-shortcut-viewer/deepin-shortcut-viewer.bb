SUMMARY = "Deepin Shortcut Viewer"
DESCRIPTION = "The program displays a shortcut key window when a JSON data is passed."
LICENSE = "GPL-3.0-or-later"

PV = "5.0.6"

RPM_NAME = "deepin-shortcut-viewer-5.0.6-1.4.aarch64.rpm"
RPM_HASH = "306cb03082bb72f4f4745a9086c04e5ba026f3ec67ca8cdd128be922284a2187537e953efd6f54e61c1f608acfd806a94683a2f72c901bda8e3e04d595e85b0a"

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
