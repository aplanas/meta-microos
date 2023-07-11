SUMMARY = "LeechCraft Azoth Text transform Module"
DESCRIPTION = "This package provides a text transform plugin for LeechCraft Azoth."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-keeso-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "89b6b1fa195bbeb69da8015402b14220a7814812f803736dfa9a46baefef787f43c897afb3cb7e4f866703eac6061aec64065506759d19554226b14682f37dcf"

RPROVIDES:${PN} += "leechcraft-azoth-keeso \
libleechcraft-azoth-keeso.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
