SUMMARY = "Examples for the qt6-tools modules"
DESCRIPTION = "Examples for the qt6-tools modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.2"

RPM_NAME = "qt6-tools-examples-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "e2875da3e347e2c7803ff52892b5cf03ce4b8b3581875c15d74a44c6f30cd961af4cad8e1bb930dd1ba236b18318ecb080892ff8e081af9f29443a12e8d4c858"

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
