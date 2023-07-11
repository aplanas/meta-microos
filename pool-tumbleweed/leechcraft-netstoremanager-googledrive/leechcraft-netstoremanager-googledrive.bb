SUMMARY = "LeechCraft Google Drive storage Module"
DESCRIPTION = "This package provides a Google Drive subplugin for Leechcraft NetStoreManager."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-netstoremanager-googledrive-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "17ce57e3d1e60b4298bd8f50074f6c9cb560897a9a2861f37c0843d460d5de983eac60e735e6f564b051895c0efc9a6893396dd19a1eda5ff4ac948b68f51709"

RPROVIDES:${PN} += "leechcraft-netstoremanager-googledrive \
leechcraft-netstoremanager-subplugin \
libleechcraft-netstoremanager-googledrive.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-netstoremanager \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
