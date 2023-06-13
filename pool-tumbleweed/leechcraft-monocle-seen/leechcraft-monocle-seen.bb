SUMMARY = "Djvu support for LeechCraft Monocle"
DESCRIPTION = "This package contains a LeechCraft Monocle subplugin for djvu \
document support via the djvulibre backend."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-monocle-seen-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "a09b15b1a872f2313e4a60fc22089e5827d74a56a3e38451f0b5f026a2cbb3e9ed6a07486704da57b23e61b76609afd37165fbb5742e2f0ef7e25bed2ac90caa"

RPROVIDES:${PN} += "application() \
application(leechcraft-monocle-seen-qt5.desktop) \
leechcraft-monocle-seen \
leechcraft-monocle-seen(aarch-64) \
leechcraft-monocle-subplugin \
libleechcraft_monocle_seen.so()(64bit) \
mimehandler(image/vnd.djvu)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
leechcraft \
leechcraft-monocle \
libQt5Concurrent.so.5()(64bit) \
libQt5Concurrent.so.5(Qt_5)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libdjvulibre.so.21()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libleechcraft-util-qt5.so.0.6.75()(64bit) \
libleechcraft-util-sll-qt5.so.0.6.75.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
