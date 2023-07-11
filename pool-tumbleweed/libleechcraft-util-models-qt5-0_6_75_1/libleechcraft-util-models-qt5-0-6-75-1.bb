SUMMARY = "MVC utility library for LeechCraft"
DESCRIPTION = "A library providing some commonly used models (as in MVC), \
as well as model-related classes and functions."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "libleechcraft-util-models-qt5-0_6_75_1-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "48af5d7cec5e750b3218e53323c855569041f27366799e061c8303ba7d4796f2aa88805386247c1773416559ee56dbb5f082c1c04e4a75bd76e39144e4dc7a26"

RPROVIDES:${PN} += "libleechcraft-util-models-qt5-0-6-75-1 \
libleechcraft-util-models-qt5.so.0.6.75.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
