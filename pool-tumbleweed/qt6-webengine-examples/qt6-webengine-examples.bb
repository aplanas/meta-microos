SUMMARY = "Examples for the qt6-webengine modules"
DESCRIPTION = "Examples for the qt6-webengine modules."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-webengine-examples-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "dad69aee0cac98151398782dd7761ead242a13404f38a2e848cf57b8c7b6debf599fb233e325ea7b22612d2a98a7e4265ff9514eb93518d2cb2772ed3e2edd39"

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
