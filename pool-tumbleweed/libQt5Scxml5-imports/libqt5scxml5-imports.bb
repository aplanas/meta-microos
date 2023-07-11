SUMMARY = "Qt 5 Scxml Addon - QML imports"
DESCRIPTION = "The Qt SCXML module provides functionality to create state machines \
from SCXML files. \
 \
The Qt SCXML module provides functionality to create state machines from SCXML files. \
It also contains functionality to support data models and executable content."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libQt5Scxml5-imports-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "e01c07d6c3772604ba0e1c1a80de187e7fae5d128b34c13e368ccff4b90197e6d69b6c0ae3e71988920467eb3c5b99f65661e4e074dbb4d0b80f4c542e3b6d23"

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
