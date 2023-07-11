SUMMARY = "Minimal GUI Application using the QCSXCAD library"
DESCRIPTION = "Minimal GUI Application using the QCSXCAD library."
LICENSE = "GPL-3.0-only"

PV = "0.2.2"

RPM_NAME = "AppCSXCAD-0.2.2-2.18.aarch64.rpm"
RPM_HASH = "52bf7022a9a7a0adc74a2f0068fc4509577841111c33958659a6fe517927873bc4a33a35b4fc262b3cc7edc0dd78a6fb3034bf9b97f91959f66af8f425a1d790"

RPROVIDES:${PN} += "AppCSXCAD"

RDEPENDS:${PN} += "/usr/bin/bash \
libCSXCAD.so.0 \
libQCSXCAD.so.0 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libvtksys.so.1"

inherit rpm
