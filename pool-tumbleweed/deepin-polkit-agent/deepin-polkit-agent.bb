SUMMARY = "Deepin Polkit Agent"
DESCRIPTION = "DDE Polkit Agent is the polkit agent used in Deepin Desktop Environment."
LICENSE = "GPL-3.0-or-later"

PV = "5.5.21"

RPM_NAME = "deepin-polkit-agent-5.5.21-1.2.aarch64.rpm"
RPM_HASH = "f57cde2ec413e748f03b6167e3846105b63dcdce0f7240784c37deeb0faaca7f5b9bc31e7f068b46d85274f3f56a6e8e0b7f16a61472d1fca59c294d10a67b84"

RPROVIDES:${PN} += "deepin-polkit-agent"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdframeworkdbus.so.2 \
libdtkcore.so.5 \
libdtkwidget.so.5 \
libgcc-s.so.1 \
libpolkit-qt5-agent-1.so.1 \
libpolkit-qt5-core-1.so.1 \
libstdc++.so.6"

inherit rpm
