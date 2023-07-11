SUMMARY = "Turn-based artillery game, featuring fighting hedgehogs"
DESCRIPTION = "Hedgewars is a turn-based artillery game where slow-moving hedgehocks fight \
each other with over-the-top weaponary. It can be played both online and \
rotational on the same computer."
LICENSE = "GPL-2.0-only"

PV = "1.0.2"

RPM_NAME = "hedgewars-1.0.2-1.9.aarch64.rpm"
RPM_HASH = "760fb32a9fb9698406395bc794f7e6e73975354822604fdb8d5ce55af8f7941c8fd93f9fdcaac19e1d7a5adf8bdd17c4cb52886696dcc204659f66e63496f506"

RPROVIDES:${PN} += "hedgewars \
libphyslayer.so.1.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
hedgewars-data \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-net-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
liblua5.1.so.5 \
libm.so.6 \
libphysfs.so.1 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
