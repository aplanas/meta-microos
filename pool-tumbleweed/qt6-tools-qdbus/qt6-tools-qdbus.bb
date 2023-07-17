SUMMARY = "Command line client for communication over D-Bus"
DESCRIPTION = "Command line client for communication over D-Bus."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-tools-qdbus-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "5843b460d07fe97458b4ce61406aadb2e8cf95a3719f6405496701e3db21ac60564f49896ac016a6ed05af8d7809765469dcdf5932f2ac890f4bb4a5312242aa"

RPROVIDES:${PN} += "qt6-tools-qdbus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
