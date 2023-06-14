SUMMARY = "PipeWire integration for KDE Plasma - main library"
DESCRIPTION = "KPipeWire provides PipeWire integration for the Plasma desktop and mobile shells. \
This package contains the main KPipeWire library."
LICENSE = "LGPL-2.0-only & LGPL-3.0-only"

PV = "5.27.5"

RPM_NAME = "libKPipeWire5-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "d98b0ae5939cc0f1c9be28a4747e243bf08f3bf8e953cc42866b731d3cf9a6b74430c6b3fdffd0469394b45b5160d52661b8544d974671c8733ca15f471c5b4f"

RPROVIDES:${PN} += "libKPipeWire.so.5 \
libKPipeWire5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libepoxy.so.0 \
libgbm.so.1 \
libpipewire-0.3.so.0 \
libstdc++.so.6"

inherit rpm
