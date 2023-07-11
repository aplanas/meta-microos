SUMMARY = "LeechCraft Media synchronization Module"
DESCRIPTION = "This package provides an audio syncing plugin for LeechCraft \
to synchronize with Flash-like media players."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-lmp-dumbsync-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "4bcb1067289cee8b78c66d1d6bf203c55af13265916ddd30c082c94e4f4419027017b29fc5b213b2f97d9c1896532bd4b061db7e3d615a7d5fecc3453392b61d"

RPROVIDES:${PN} += "leechcraft-lmp-dumbsync \
libleechcraft-lmp-dumbsync.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-lmp \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
