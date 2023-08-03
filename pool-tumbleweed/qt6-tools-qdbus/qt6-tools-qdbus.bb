SUMMARY = "Command line client for communication over D-Bus"
DESCRIPTION = "Command line client for communication over D-Bus."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.2"

RPM_NAME = "qt6-tools-qdbus-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "5ad8722e9ca03197322564cbbf16b1191036e06679951e4650b47a9cc493665eb4205892cd56e1efdc5c2084f468ad172d16a8e93af929a44c117dff45d47a99"

RPROVIDES:${PN} += "qt6-tools-qdbus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
