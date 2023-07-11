SUMMARY = "IconLoader library for QtXDG"
DESCRIPTION = "QtXDG icon loader libraries used in LXQt"
LICENSE = "GPL-3.0-only"

PV = "3.11.0"

RPM_NAME = "libQt5XdgIconLoader3-3.11.0-1.3.aarch64.rpm"
RPM_HASH = "c4094cb3deeb95e1edaf819c3fe7fdde3f0f82697dc770240cb34730ab64368772d6157531f8245b6d988e7b440227200cc11b061de5d145b5d5877aa3ad4855"

RPROVIDES:${PN} += "libQt5XdgIconLoader.so.3 \
libQt5XdgIconLoader3 \
libqtxdgiconloader"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
