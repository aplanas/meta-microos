SUMMARY = "LeechCraft Azoth Module to remove CAPS"
DESCRIPTION = "This package provides a plugin for LeechCraft Azoth which \
can remove excessive CAPS usage from incoming messages."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-isterique-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "80f798758513663d5f0566e0ece41575ca0928645205f099a2a89c1a74740e5eb4dc103566a3169c7b15d23ffbae8ecfa7d574b3ddf91542aaa6372b4fc3d890"

RPROVIDES:${PN} += "leechcraft-azoth-isterique \
libleechcraft-azoth-isterique.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
