SUMMARY = "SCXML (state machine notation) compiler and related tools"
DESCRIPTION = "The Qt SCXML module provides functionality to create state machines from SCXML \
files."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-scxml-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "8ab23a6e9b92cc42938da94d11ca497ec639a948116f85420c7ffee2ddac805213a31fefbccf005b063b4a3dfddb41cf62f21ef2660b42369ce8fa6647d18467"

RPROVIDES:${PN} += "libqscxmlecmascriptdatamodel.so \
qt6-scxml"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6Scxml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
