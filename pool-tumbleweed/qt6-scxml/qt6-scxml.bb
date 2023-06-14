SUMMARY = "SCXML (state machine notation) compiler and related tools"
DESCRIPTION = "The Qt SCXML module provides functionality to create state machines from SCXML \
files."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-scxml-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "655f73ecc5e4437df5157268cc13a5a53c7c39fb99b14653787f9105824b621c2ccab253f7e8d040f81d2d718362faa5480abfa9786f012f5345beb64b7a4e09"

RPROVIDES:${PN} += "libqscxmlecmascriptdatamodel.so \
qt6-scxml"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6Scxml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
