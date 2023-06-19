SUMMARY = "Qt 6 Tools libraries and tools"
DESCRIPTION = "The QtTools modules contains some tools mostly useful for application \
development. \
 \
Included are Qt Designer (GUI design), QDbusViewer and more."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-tools-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "56e116568c0bd0cc88403c5d5c504c51e028e752822f233af47b9c6aaf24aceada47b5b3e0ed95d936371c14206d8ae096b0a00dbd6594f009b137af26edb483"

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
