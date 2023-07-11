SUMMARY = "KIO slave to access ISO images"
DESCRIPTION = "KIO slave to access ISO images like zip- or tar.gz-archives in your \
file-browser."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "kio_iso-2.8.0-1.4.aarch64.rpm"
RPM_HASH = "54383158eac4070f72b76cb5744f170ada824fb78bc29c95d4898be1c553ab15923a7708b102af776dd2d557c073972edcc11c12f4fbd056c6f663a7b0e3552f"

RPROVIDES:${PN} += "config-kio-iso \
kde4-kio-iso \
kio-iso"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5ConfigCore.so.5 \
libKF5KIOCore.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
