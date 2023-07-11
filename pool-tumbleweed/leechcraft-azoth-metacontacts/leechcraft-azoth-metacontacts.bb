SUMMARY = "LeechCraft Azoth Metacontacts Module"
DESCRIPTION = "This package provides a metacontacts support plugin for LeechCraft Azoth."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-metacontacts-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "d460558189a4ea0d1fd05c4694ebf1f0d6aa5f490ab4a2eb530580bc9bfee0ccd7a54c7dff34a9e9e57a4ed6c31d2cb992c7b224160900e8c19dbd8127b24c45"

RPROVIDES:${PN} += "leechcraft-azoth-metacontacts \
libleechcraft-azoth-metacontacts.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libleechcraft-util-qt5.so.0.6.75 \
libstdc++.so.6"

inherit rpm
