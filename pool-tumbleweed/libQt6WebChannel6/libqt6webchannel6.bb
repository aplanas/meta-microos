SUMMARY = "Qt 6 WebChannel library"
DESCRIPTION = "The Qt 6 WebChannel library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6WebChannel6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "12a57ec66787f57b5a90c206dd1949581d47d201f92baa1f80ac5f94954056fb12593518d08be5e6c412e71e804f931fed0a3539a89bd4c9d79fbb65f4ae4180"

RPROVIDES:${PN} += "libQt6WebChannel.so.6 \
libQt6WebChannel6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
