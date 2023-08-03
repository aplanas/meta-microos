SUMMARY = "Examples for the qt6-webengine modules"
DESCRIPTION = "Examples for the qt6-webengine modules."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-webengine-examples-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "6ecd6808aec38181fdd94a502eb3814c633444115475ab740100f3e73882a605bcca6e987944fb208ef0b3f48a19b00ddf073c725c8c49195d18634af4b15398"

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
