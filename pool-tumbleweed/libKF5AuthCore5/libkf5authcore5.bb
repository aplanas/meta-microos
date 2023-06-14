SUMMARY = "Framework which lets applications perform actions as a privileged user"
DESCRIPTION = "KAuth is a framework to let applications perform actions as a privileged user."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5AuthCore5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "5a5e13c79875e5253a280004a23797a077311829459944107795f6ee99e25e5c965af06e29235328d714d434ee697b4c2168ac65b7e2fa85a200fe2a28d70b51"

RPROVIDES:${PN} += "libKF5AuthCore.so.5 \
libKF5AuthCore5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
