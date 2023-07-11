SUMMARY = "fwupd Backend for Discover"
DESCRIPTION = "A plugin for Discover to support updates of system firmware using fwupd."
LICENSE = "GPL-2.0-only & GPL-3.0-only & GPL-3.0-or-later"

PV = "5.27.6"

RPM_NAME = "discover-backend-fwupd-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "c8edaabf3dd4f6dbd6044177270a4d82d4b1f40bf0c907baedd8bcacd1f2b1228996a95150ffbd06c491f0f279b9ae34460e8536c61c94959900cab27467be6a"

RPROVIDES:${PN} += "discover-backend-fwupd"

RDEPENDS:${PN} += "discover \
ld-linux-aarch64.so.1 \
libDiscoverCommon.so \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libfwupd.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libstdc++.so.6"

inherit rpm
