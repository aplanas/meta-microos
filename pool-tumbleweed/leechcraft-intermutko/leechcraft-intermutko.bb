SUMMARY = "LeechCraft HTTP Accept-Language header Module"
DESCRIPTION = "This module provides a HTTP Accept-Language header configurator."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-intermutko-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "f8f490a1e54ef6e5f75dde95ab0d53341f9da9e3d692d40f7bd16e3204581eaed7a430a4b026ee51f5a349c67173368aadeb8868b7a55b52adc232ec9de0f0dd"

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
