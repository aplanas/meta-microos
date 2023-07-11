SUMMARY = "Qt 6 Tools libraries and tools"
DESCRIPTION = "The QtTools modules contains some tools mostly useful for application \
development. \
 \
Included are Qt Designer (GUI design), QDbusViewer and more."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-tools-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "5870782163093f56d9c4a1e885dd642ac2d81940410c17c00d9e2c1b869431df37f19d8ed4b40cf79ba0b59646f5b8e56bce9f37ff810c79d6f821fd1793b5d4"

RPROVIDES:${PN} += "qt6-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-tools-helpgenerators \
qt6-tools-qdoc"

inherit rpm
