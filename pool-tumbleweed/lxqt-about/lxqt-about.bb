SUMMARY = "LXQt About Dialog"
DESCRIPTION = "About dialog for LXQt"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-about-1.3.0-1.2.aarch64.rpm"
RPM_HASH = "498f18ec853e3143feb989877c8cc59b7595d9f56c249ff25ce27d49013f7211bb13a703feec3c5ee8b154af5f50bda9a2a30100c0cc7c0bb6047c46559b1143"

RPROVIDES:${PN} += "lxqt-about"

RDEPENDS:${PN} += "desktop-file-utils \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xdg.so.3 \
libc.so.6 \
liblxqt.so.1 \
libstdc++.so.6"

inherit rpm
