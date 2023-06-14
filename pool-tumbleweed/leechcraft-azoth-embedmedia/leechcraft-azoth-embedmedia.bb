SUMMARY = "LeechCraft Azoth Media Objects Module"
DESCRIPTION = "This package provides an plugin for LeechCraft Azoth which \
allows embedding different media objects in chat tabs."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-embedmedia-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "d587b30afe21e1015bade608aa8458aede2eb635483e49ab20e55a83bf79eb4f19f8db1c55b849f9130d5b8fa9ea8032b2ae5972d3930ada829ee41096bce0ff"

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
