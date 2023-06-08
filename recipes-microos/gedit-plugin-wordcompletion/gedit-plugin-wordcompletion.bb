SUMMARY = "Gedit wordcompletion plugin"
DESCRIPTION = "The gedit wordcompletion plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gedit-plugin-wordcompletion-44.1-1.3.aarch64.rpm"
RPM_HASH = "81ec57a73e8ff2ceee09fc458a8275f3bed24753595bf1e01fca881b8723db0a86218b8b6f6e3d6a4573c8e71d2da99a2ddceb1885534ac0749643b4b53481e1"

RPROVIDES:${PN} += "gedit-plugin-wordcompletion gedit-plugin-wordcompletion(aarch-64) gedit-plugins:/usr/lib64/gedit/plugins/wordcompletion.plugin libwordcompletion.so()(64bit) metainfo() metainfo(gedit-wordcompletion.metainfo.xml)"
RDEPENDS:${PN} += "gedit-plugins-data ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgedit-44.so()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgtksourceview-4.so.0()(64bit) libpeas-1.0.so.0()(64bit) libpeas-gtk-1.0.so.0()(64bit)"

inherit rpm
