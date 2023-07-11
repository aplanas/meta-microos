SUMMARY = "MOBI support for LeechCraft Monocle"
DESCRIPTION = "This package contains the MOBI subplugin for LeechCraft Monocle."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-monocle-dik-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "6f66d24a57d02fa080ec7b041fb36c51861516996192a940affa9eaad91ca400b52d115b2cee1155850fc319f26769762c91bd9fa9a73d4866d46a68e403e71b"

RPROVIDES:${PN} += "leechcraft-monocle-dik \
leechcraft-monocle-subplugin \
libleechcraft-monocle-dik.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-monocle \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-monocle.so \
libleechcraft-util-qt5.so.0.6.75 \
libstdc++.so.6"

inherit rpm
