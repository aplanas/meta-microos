SUMMARY = "Gedit bookmarks plugin"
DESCRIPTION = "The gedit bookmarks plugin."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gedit-plugin-bookmarks-44.1-1.3.aarch64.rpm"
RPM_HASH = "34db81f6a0767938422457348f68726bbe58e04ce6678b15354fd90880865e23237002f7372832e63305b5b549d9f65664fb08b7c99dab87352c8551cbbe783f"

RPROVIDES:${PN} += "gedit-plugin-bookmarks \
gedit-plugin-bookmarks(aarch-64) \
gedit-plugins:/usr/lib64/gedit/plugins/bookmarks.plugin \
libbookmarks.so()(64bit) \
metainfo() \
metainfo(gedit-bookmarks.metainfo.xml)"

RDEPENDS:${PN} += "gedit-plugins-data \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgdk-3.so.0()(64bit) \
libgedit-44.so()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtksourceview-4.so.0()(64bit) \
libpeas-1.0.so.0()(64bit)"

inherit rpm
