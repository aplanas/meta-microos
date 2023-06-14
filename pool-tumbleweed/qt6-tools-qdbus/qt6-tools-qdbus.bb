SUMMARY = "Command line client for communication over D-Bus"
DESCRIPTION = "Command line client for communication over D-Bus."
LICENSE = "GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-tools-qdbus-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "a5d03803ae1a9c2ec86d006380a82fef9de5fc89bc2856341581356c749bda5c709848c4c646053eee00663f882f43848229df44da8a7c336c2e343e8f7593bf"

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
