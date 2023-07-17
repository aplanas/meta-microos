SUMMARY = "SCXML (state machine notation) compiler and related tools"
DESCRIPTION = "The Qt SCXML module provides functionality to create state machines from SCXML \
files."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-scxml-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "6b34944f198b0c853a947704f9469cfd6ffbf9220f0590ed7cac85f089d662177cabaf29c5c1f37cb2180a5b63b913b0125e0e54e9ed46be0298dead780018f6"

RPROVIDES:${PN} += "libqscxmlecmascriptdatamodel.so \
qt6-scxml"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6Scxml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
