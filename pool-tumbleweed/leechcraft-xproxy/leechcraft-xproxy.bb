SUMMARY = "LeechCraft Proxy manager Module"
DESCRIPTION = "This package provides an advanced proxy manager for LeechCraft \
with which you can configure and use proxy servers."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-xproxy-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "44fb0a46335aa628c4bef8bc48635526b4f30acd3f4307d931a82ac8e0d29477f4d5f29ed1b896cc1db5d7dc96aadaba803cf4a75b9f7c271aed2d08ba4107de"

RPROVIDES:${PN} += "leechcraft-xproxy \
libleechcraft-xproxy.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
