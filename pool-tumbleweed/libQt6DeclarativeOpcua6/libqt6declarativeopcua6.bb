SUMMARY = "Qt 6 DeclarativeOpcua library"
DESCRIPTION = "Qt 6 DeclarativeOpcua library."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6DeclarativeOpcua6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "19466d1082ece0983ddf876dba8e14c126c9f3cc18bf4f59d8e7e45f1fd61f303bcdb81732d7b4f9ef1c89aab6931c00437fad42ed3163d21041c2e9b07f315a"

RPROVIDES:${PN} += "libQt6DeclarativeOpcua.so.6 \
libQt6DeclarativeOpcua6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpcUa.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
