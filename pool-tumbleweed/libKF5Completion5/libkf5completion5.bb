SUMMARY = "Widgets with advanced completion support"
DESCRIPTION = "KCompletion provides widgets with advanced completion support as well as a \
lower-level completion class which can be used with your own widgets."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5Completion5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "883fffb2f68fda90e630de76533b7188a6743255de2c0e390a04815c9c97375cde7bfbbf7ffe17a39e528e94cf4b79464f40abeb7477ad44014732b0a2d0092f"

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
