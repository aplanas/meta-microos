SUMMARY = "LXQt About Dialog"
DESCRIPTION = "About dialog for LXQt"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-about-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "ad3ee75d3a37c1cc22e5ca9d6151e731d4923155f7b4ae1ec36d5461b5abeb87320da49ab48b6785b93c7db1a166b48b6008f3e54180a6c457d875644d2692f2"

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
