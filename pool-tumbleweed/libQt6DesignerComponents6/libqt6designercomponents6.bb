SUMMARY = "Qt 6 DesignerComponents library"
DESCRIPTION = "The Qt 6 DesignerComponents library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.2"

RPM_NAME = "libQt6DesignerComponents6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "03544682c4bd3dce6e9ae2ef0c6cd450c4276c88af1585811605c9d35f92e6807a4843ac857348d11a3bdeb067198ba5aeb0a4c7eeebe35172ed1027d332f43d"

RPROVIDES:${PN} += "libQt6DesignerComponents.so.6 \
libQt6DesignerComponents6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Designer.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
