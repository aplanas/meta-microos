SUMMARY = "Gedit wordcompletion plugin"
DESCRIPTION = "The gedit wordcompletion plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gedit-plugin-wordcompletion-44.1-1.3.aarch64.rpm"
RPM_HASH = "81ec57a73e8ff2ceee09fc458a8275f3bed24753595bf1e01fca881b8723db0a86218b8b6f6e3d6a4573c8e71d2da99a2ddceb1885534ac0749643b4b53481e1"

RPROVIDES:${PN} += "gedit-plugin-wordcompletion \
gedit-plugins-/usr/lib64/gedit/plugins/wordcompletion.plugin \
libwordcompletion.so"

RDEPENDS:${PN} += "gedit-plugins-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgedit-44.so \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
libpeas-1.0.so.0 \
libpeas-gtk-1.0.so.0"

inherit rpm
