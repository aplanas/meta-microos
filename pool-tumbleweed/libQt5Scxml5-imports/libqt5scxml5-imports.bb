SUMMARY = "Qt 5 Scxml Addon - QML imports"
DESCRIPTION = "The Qt SCXML module provides functionality to create state machines \
from SCXML files. \
 \
The Qt SCXML module provides functionality to create state machines from SCXML files. \
It also contains functionality to support data models and executable content."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt5Scxml5-imports-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "513706f636dcd8c370f98b29b6d17503ffb061dc155c86fdd9148df7e7abeb35ca867e66d582420b592912ad114a5a04c1fe8baf9cb136b236308be667d6cb7d"

RPROVIDES:${PN} += "libQt5Scxml5-imports \
libdeclarative-scxml.so \
qt5qmlimport-QtScxml.5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libQt5Scxml.so.5 \
libQtQuick5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
