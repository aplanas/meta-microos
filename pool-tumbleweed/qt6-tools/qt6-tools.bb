SUMMARY = "Qt 6 Tools libraries and tools"
DESCRIPTION = "The QtTools modules contains some tools mostly useful for application \
development. \
 \
Included are Qt Designer (GUI design), QDbusViewer and more."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.2"

RPM_NAME = "qt6-tools-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "c01b7eac329928a28b1f1fc99c7eeb706faaecc2bf5ad1575f6dfe2d4edc47061412d33bad59bd48062f8f226435065bb8536b703d63be6d5664bfcb2cbcfa95"

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
