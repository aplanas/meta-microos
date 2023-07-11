SUMMARY = "Command line client for communication over D-Bus"
DESCRIPTION = "Command line client for communication over D-Bus."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.10+kde3"

RPM_NAME = "libqt5-qdbus-5.15.10+kde3-1.1.aarch64.rpm"
RPM_HASH = "912d19c8dd3cf75d4e9b966c5aa517728847efbf5c040af8c67954e230c6ff729a8e1e8cad17b199d7f3451728159cbb7b1ba6af1e2839aee706acec3393a4f1"

RPROVIDES:${PN} += "libqt5-qdbus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
