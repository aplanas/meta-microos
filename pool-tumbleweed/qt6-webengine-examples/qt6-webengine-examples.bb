SUMMARY = "Examples for the qt6-webengine modules"
DESCRIPTION = "Examples for the qt6-webengine modules."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-webengine-examples-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "aea24e084e8365badbe643686ab199f019513c04346c9cf9b5c5d4351c645516f01dff97970cccca6fa583ad4060e37a801b2f94e49a47e9796c7d188157963a"

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
