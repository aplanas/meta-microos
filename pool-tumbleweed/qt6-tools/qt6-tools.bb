SUMMARY = "Qt 6 Tools libraries and tools"
DESCRIPTION = "The QtTools modules contains some tools mostly useful for application \
development. \
 \
Included are Qt Designer (GUI design), QDbusViewer and more."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-tools-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "241f6a7997b74a3588c8b88699b8740a12fef2a56db5639d7de26f965f1e22d0a786eb46e8a04729e440e59a510df142773e8dae65db93f9b60704229350058d"

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
