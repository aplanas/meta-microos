SUMMARY = "LeechCraft HTTP Accept-Language header Module"
DESCRIPTION = "This module provides a HTTP Accept-Language header configurator."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-intermutko-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "56ff3fc200127f50897f1e8a4963957a38a13ec45b29aa3b74149436d355f96ad7876a05225b1408d0fa777f8749d7a2451835f9a805a55c6f156c189e71d1db"

RPROVIDES:${PN} += "leechcraft-intermutko \
libleechcraft-intermutko.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
