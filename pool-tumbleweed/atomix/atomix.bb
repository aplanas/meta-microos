SUMMARY = "A puzzle game where you move atoms to build a molecule"
DESCRIPTION = "You start the game with the map filled with walls and a few atoms, which you can \
move in any direction. However, the atoms won't stop until they hit a wall or \
another atom. \
 \
You can see a preview of what molecule you have to build, and you have to do your \
best to find where to build the molecule, and move the atoms there."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "atomix-44.0-1.1.aarch64.rpm"
RPM_HASH = "4ee7728d494be764cb98898980b61c120c23cbab512a698d187bd7292eff89212697b9b395415ff5a1e26878f513c75ce3c29c8381917569a21b1bdbabd5be4a"

RPROVIDES:${PN} += "application() \
application(atomix.desktop) \
atomix \
atomix(aarch-64) \
metainfo() \
metainfo(atomix.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnome-games-support-1.so.3()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
