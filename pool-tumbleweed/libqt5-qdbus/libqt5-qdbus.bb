SUMMARY = "Command line client for communication over D-Bus"
DESCRIPTION = "Command line client for communication over D-Bus."
LICENSE = "GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "5.15.9+kde1"

RPM_NAME = "libqt5-qdbus-5.15.9+kde1-1.1.aarch64.rpm"
RPM_HASH = "a580fff88a0280c7d88bd317cb1bcaa9b76aed322e000012f085ad878b784030d1efb0703b2416dea30545f9da5ca516214e4559eb14a15b23da98910829c776"

RPROVIDES:${PN} += "libqt5-qdbus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
