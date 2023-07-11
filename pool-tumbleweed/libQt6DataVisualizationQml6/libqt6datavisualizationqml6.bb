SUMMARY = "Qt 6 DataVisualizationQml library"
DESCRIPTION = "The Qt 6 DataVisualizationQml library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6DataVisualizationQml6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "b7a6e5f39b3460b29a2f7fc0a231036c2445ea6ad0726bf9ab4919753d51a2fbcd4405dc97301c4e0808eb5d521badbf2a2fe8c4f305fe996dd3a188d970b6ed"

RPROVIDES:${PN} += "libQt6DataVisualizationQml.so.6 \
libQt6DataVisualizationQml6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DataVisualization.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
