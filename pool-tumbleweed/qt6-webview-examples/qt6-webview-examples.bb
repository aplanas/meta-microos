SUMMARY = "Examples for the qt6-webview modules"
DESCRIPTION = "Examples for the qt6-webview modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-webview-examples-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "8a6ec2c78acae930c02fec3c85975f4c00d6fd078100a88499787305e923f1f7b8cb5746862e74ea18ce28466ff901818b311c67cb6a0564cf036c81e7262494"

RPROVIDES:${PN} += "qt6-webview-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6WebView.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
