SUMMARY = "Qt 6 bluetooth library"
DESCRIPTION = "Provides access to Bluetooth hardware."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6Bluetooth6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "47a20ec480a7b11b44ace81ff3cd2da73d35d5614ab7ff59e5bae835d6dcbce1959ecab79719d2cf6654dcf2cd7038f19779f939c29efa3f4f26cc80bada6b82"

RPROVIDES:${PN} += "libQt6Bluetooth.so.6 \
libQt6Bluetooth6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
