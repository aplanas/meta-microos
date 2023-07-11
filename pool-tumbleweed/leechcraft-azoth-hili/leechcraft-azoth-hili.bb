SUMMARY = "LeechCraft Azoth Conference highlights Module"
DESCRIPTION = "This package provides a plugin for LeechCraft Azoth to customize \
conference highlights."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-hili-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "51689db9d210210ae7e3b01f9d1dd08f22b7d59dc2ed7a35dbacf5341744bec118aa6249ff55099f23be4d6f3723299dad462418342912500abe5d39a2f70519"

RPROVIDES:${PN} += "leechcraft-azoth-hili \
libleechcraft-azoth-hili.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
