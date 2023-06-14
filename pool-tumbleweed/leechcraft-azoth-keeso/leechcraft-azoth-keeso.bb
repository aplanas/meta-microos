SUMMARY = "LeechCraft Azoth Text transform Module"
DESCRIPTION = "This package provides a text transform plugin for LeechCraft Azoth."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-keeso-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "d609bd535f3e6037aa23131062eb7b8a91dd086f785d759b636e8b138c17001de8ead814d28d1dd940634bc4a3e157918bb30937e664658e1d8caa775aee044c"

RPROVIDES:${PN} += "leechcraft-azoth-keeso \
libleechcraft-azoth-keeso.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
