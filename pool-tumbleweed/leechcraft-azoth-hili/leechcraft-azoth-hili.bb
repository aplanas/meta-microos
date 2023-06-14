SUMMARY = "LeechCraft Azoth Conference highlights Module"
DESCRIPTION = "This package provides a plugin for LeechCraft Azoth to customize \
conference highlights."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-hili-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "080e92d59ba81156567073010b8c546d09c5368b74235b0ebc9afb608144e402c1940625c315de84ba90fe8e70ae629e705d5d86119ff1a2cf05f64489f277bd"

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
