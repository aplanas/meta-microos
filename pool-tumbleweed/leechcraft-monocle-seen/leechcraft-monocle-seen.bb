SUMMARY = "Djvu support for LeechCraft Monocle"
DESCRIPTION = "This package contains a LeechCraft Monocle subplugin for djvu \
document support via the djvulibre backend."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-monocle-seen-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "daf9046f4a2118402ec762362fa460461eb6e95e17873d11dd776cbf934ea8ff1f027ee087e2042b2685c48e3cf1f57d786790c280fadb8a079e2d5038d59fba"

RPROVIDES:${PN} += "leechcraft-monocle-seen \
leechcraft-monocle-subplugin \
libleechcraft-monocle-seen.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-monocle \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libdjvulibre.so.21 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libstdc++.so.6"

inherit rpm
