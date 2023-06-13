SUMMARY = "Turn-based artillery game, featuring fighting hedgehogs"
DESCRIPTION = "Hedgewars is a turn-based artillery game where slow-moving hedgehocks fight \
each other with over-the-top weaponary. It can be played both online and \
rotational on the same computer."
LICENSE = "GPL-2.0-only"

PV = "1.0.2"

RPM_NAME = "hedgewars-1.0.2-1.7.aarch64.rpm"
RPM_HASH = "265bf3a7374f1d7e55541180eee33801ca8fb390f8af57fdb2128102020c25234a9fc993a4398d0e45c05640da8fbeea50a725a0a332aaaf185019cdb4688588"

RPROVIDES:${PN} += "application() \
application(hedgewars.desktop) \
hedgewars \
hedgewars(aarch-64) \
libphyslayer.so.1.0()(64bit) \
metainfo() \
metainfo(hedgewars.appdata.xml) \
mimehandler(x-scheme-handler/hwplay)"

RDEPENDS:${PN} += "/sbin/ldconfig \
hedgewars-data \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2_image-2.0.so.0()(64bit) \
libSDL2_mixer-2.0.so.0()(64bit) \
libSDL2_net-2.0.so.0()(64bit) \
libSDL2_ttf-2.0.so.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
liblua5.1.so.5()(64bit) \
libm.so.6()(64bit) \
libphysfs.so.1()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
