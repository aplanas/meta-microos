SUMMARY = "JsonRpc 2.0 protocol implementation"
DESCRIPTION = "JsonRpc 2.0 protocol implementation for Qt6."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6JsonRpc6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "dab4f18ffa4226d662a145236ba06f60f20263c6daea819251bdcff0889c4583d93d846e9da056a5672df7ec3bd7de95e2b5ca5f66034829d657b365d4aa27d3"

RPROVIDES:${PN} += "libQt6JsonRpc.so.6 \
libQt6JsonRpc6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
