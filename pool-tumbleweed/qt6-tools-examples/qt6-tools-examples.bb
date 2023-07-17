SUMMARY = "Examples for the qt6-tools modules"
DESCRIPTION = "Examples for the qt6-tools modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-tools-examples-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "fcc47c834f5cd59c86a900734a2ec000d18554a9e5d306130b60c0a16729d43b34257c8e607e6cbacc2cfe31dcba6f3ea35945085db399a84880028d87daac79"

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
