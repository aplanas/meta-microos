SUMMARY = "Widgets with advanced completion support"
DESCRIPTION = "KCompletion provides widgets with advanced completion support as well as a \
lower-level completion class which can be used with your own widgets."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5Completion5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "141c3ce6dafc1894a172d3de063d75a982e18b874b3fedaf70e5a29ca85d823acb0e96d894a2fbd8bee7508a4aecb39c70baedfdaf58aae537039c2af5920e09"

RPROVIDES:${PN} += "libKF5Completion.so.5 \
libKF5Completion5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
