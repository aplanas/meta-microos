SUMMARY = "Qt 5 State Chart XML Library"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
The Qt SCXML module provides functionality to create state machines \
from SCXML files. This includes both dynamically creating state \
machines (loading the SCXML file and instantiating states and \
transitions) and generating a C++ file that has a class implementing \
the state machine. It also contains functionality to support data \
models and executable content."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libQt5Scxml5-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "2481d25b7c118f2f262116c030acd0b78ef8cd82f2a5099da920591f4c7d9c33ea60d5a78412f521c42a0742c4cf8350c5386246373720381b1b67dda2c12239"

RPROVIDES:${PN} += "libQt5Scxml.so.5 \
libQt5Scxml5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Qml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
