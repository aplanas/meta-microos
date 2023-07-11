SUMMARY = "KIO slave for stashing temporary files"
DESCRIPTION = "This KIO slave can be used to stash files in a virtual \
folder temporarily. It requires use of a KIO-compatible \
file manager, like dolphin."
LICENSE = "GPL-2.0+"

PV = "1.0"

RPM_NAME = "kio-stash-1.0-1.30.aarch64.rpm"
RPM_HASH = "0a0eba67e8171bddf8a5213551f44e0387a54016887314eb70ad0653ef4900759d4a86393dc959482d2218df9eda90c62e9b08387649d0ca22a6838bfc1865d3"

RPROVIDES:${PN} += "kio-stash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
