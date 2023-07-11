SUMMARY = "Qt tool for creating screenshots"
DESCRIPTION = "Screenshot taker with the ability to publish them via hosting services."
LICENSE = "GPL-2.0-only"

PV = "2.6.0"

RPM_NAME = "screengrab-2.6.0-1.2.aarch64.rpm"
RPM_HASH = "e96cbd99e5feab6eb15dc94d97acfb1009467ff90d0c2e1c8c2405022798d9cfbb1457a6281af84e555ee85629a0f7811a531272c244a107c7e418fb2bfebb63"

RPROVIDES:${PN} += "screengrab"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xdg.so.3 \
libX11-xcb.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxcb-xfixes.so.0"

inherit rpm
