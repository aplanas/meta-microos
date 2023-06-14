SUMMARY = "MOBI support for LeechCraft Monocle"
DESCRIPTION = "This package contains the MOBI subplugin for LeechCraft Monocle."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-monocle-dik-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "f9d98e66b9cf5747ec4375a01d71f5e2273ab556b748d079b268c40b7419a6ba639b98773bcb314978a4c9bb01a9cc354ae5c42015775cf3bb3813e8c86e6139"

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
