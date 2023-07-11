SUMMARY = "wlr-layer-shell integration for Qt 5"
DESCRIPTION = "This allows integration of Qt applications with wlr-layer-shell."
LICENSE = "LGPL-3.0-or-later"

PV = "5.27.6"

RPM_NAME = "layer-shell-qt5-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "71e385b32001cf8f5ad17c9d28500728a3154bb8bb836a9aaae9ced0ee6931917b619abdf8c710d353556c8c19965bd5d01fa5da635533e88376e6a2e55e75e6"

RPROVIDES:${PN} += "layer-shell-qt5 \
libLayerShellQtInterface.so.5 \
liblayer-shell.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5WaylandClient.so.5 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0"

inherit rpm
