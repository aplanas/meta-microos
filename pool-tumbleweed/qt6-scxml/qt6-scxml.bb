SUMMARY = "SCXML (state machine notation) compiler and related tools"
DESCRIPTION = "The Qt SCXML module provides functionality to create state machines from SCXML \
files."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-scxml-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "08e470b7382c3b10ab61d9714d2db971c3b6ff3ca0f11c3471f198f280df069754eeaf4b38305438a643985ca956b3e620794fb6683c8895bd3423ef3ccba6b3"

RPROVIDES:${PN} += "libqscxmlecmascriptdatamodel.so \
qt6-scxml"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6Scxml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
