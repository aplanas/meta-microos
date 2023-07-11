SUMMARY = "Deepin Manual"
DESCRIPTION = "Deepin Manual is designed to help users learn the operating system and its \
applications, providing specific instructions and function descriptions."
LICENSE = "GPL-3.0-or-later"

PV = "5.8.12"

RPM_NAME = "deepin-manual-5.8.12-1.10.aarch64.rpm"
RPM_HASH = "3769bb86468cb3a477d8e507274bcc0c19821a382cb722d91b671f7fe69892f8b839c015f6b28adc39b7ac3d1bc49b75b600cf704653a183fd658cc6e467e1e5"

RPROVIDES:${PN} += "deepin-manual"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5WebChannel.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdtkcore.so.5 \
libdtkgui.so.5 \
libdtkwidget.so.5 \
libstdc++.so.6"

inherit rpm
