SUMMARY = "Framework which lets applications perform actions as a privileged user"
DESCRIPTION = "KAuth is a framework to let applications perform actions as a privileged user."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5AuthCore5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "6c4235a4ced3f02a9dc1b883645974ebab8bbeadcf887aa2f4f1fdb49f773ccc1f045fc28bb706dd6e3e3693022e082da07549598a1f44075d5da88e5ede0e3f"

RPROVIDES:${PN} += "libKF5AuthCore.so.5 \
libKF5AuthCore5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
