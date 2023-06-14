SUMMARY = "Djvu support for LeechCraft Monocle"
DESCRIPTION = "This package contains a LeechCraft Monocle subplugin for djvu \
document support via the djvulibre backend."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-monocle-seen-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "a09b15b1a872f2313e4a60fc22089e5827d74a56a3e38451f0b5f026a2cbb3e9ed6a07486704da57b23e61b76609afd37165fbb5742e2f0ef7e25bed2ac90caa"

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
