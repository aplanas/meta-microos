SUMMARY = "Command line client for communication over D-Bus"
DESCRIPTION = "Command line client for communication over D-Bus."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-tools-qdbus-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "c3e629e223ab6bf0acc2a45d4b4f4d71ce765c610137dd6995f4d6f1d78e183ec29af5538c4b9728c09feff46059bd1326b05748a5513b821b873f175d164c72"

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
