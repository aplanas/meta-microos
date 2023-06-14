SUMMARY = "Examples for the qt6-webengine modules"
DESCRIPTION = "Examples for the qt6-webengine modules."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-webengine-examples-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "5d7f7d8d0ebdcb8d1453f39f2505c61a1de5fe8d228b44404c51e8219411fcf86a360294f06796eb0df8cb2bf2807b45b7b1135dca2e1a1eeecae91ed82b488b"

RPROVIDES:${PN} += "qt6-webengine-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Pdf.so.6 \
libQt6PdfWidgets.so.6 \
libQt6PrintSupport.so.6 \
libQt6Qml.so.6 \
libQt6WebChannel.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineQuick.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
