SUMMARY = "Qt 6 WebChannel library"
DESCRIPTION = "The Qt 6 WebChannel library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6WebChannel6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "bae67551a694f746f713c3831d4eed41f4f8a235a74ba450872aaaaf068bf7ab575be92b4084f2e6d616f4aa26cb5471ef985bd1a5b31440fd0ba924d924c772"

RPROVIDES:${PN} += "libQt6WebChannel.so.6 \
libQt6WebChannel6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
