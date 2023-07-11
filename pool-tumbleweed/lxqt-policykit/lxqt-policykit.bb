SUMMARY = "PolicyKit authentication agent"
DESCRIPTION = "PolicyKit authentication agent for LXQt"
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0"

RPM_NAME = "lxqt-policykit-1.2.0-1.3.aarch64.rpm"
RPM_HASH = "3ff818c32fe40822806932cb2c8a4c1ec7ffd857201b0b07d20e5e85957cf4ae61a4c9043fd189d19c754d588078fa928724c01e259b84d3217e766833b58b16"

RPROVIDES:${PN} += "config-lxqt-policykit \
lxqt-policykit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
liblxqt.so.1 \
libpolkit-qt5-agent-1.so.1 \
libpolkit-qt5-core-1.so.1 \
libstdc++.so.6"

inherit rpm
