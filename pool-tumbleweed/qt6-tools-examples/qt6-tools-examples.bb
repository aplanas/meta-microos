SUMMARY = "Examples for the qt6-tools modules"
DESCRIPTION = "Examples for the qt6-tools modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-tools-examples-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "dcc11c5f1d52a89b141650e1d2611ac984821670ff8bc11d197c394ffd5b44c9a6b49021a49fbf4231f9b2457bbaecd87580706e56645bb563c5a2ba26cf66f0"

RPROVIDES:${PN} += "qt6-tools-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Help.so.6 \
libQt6UiTools.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
