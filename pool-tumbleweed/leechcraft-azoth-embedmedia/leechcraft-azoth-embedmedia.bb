SUMMARY = "LeechCraft Azoth Media Objects Module"
DESCRIPTION = "This package provides an plugin for LeechCraft Azoth which \
allows embedding different media objects in chat tabs."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-embedmedia-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "29e486e89c70faa53cf47814f3814120f2ffa6df54985301b45fbd5c7ccfeaae434bf0a790929810d94258129267881bd912e988c928395038800c08d9e1e832"

RPROVIDES:${PN} += "leechcraft-azoth-embedmedia \
libleechcraft-azoth-embedmedia.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt5Core.so.5 \
libQt5WebEngineWidgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libstdc++.so.6"

inherit rpm
