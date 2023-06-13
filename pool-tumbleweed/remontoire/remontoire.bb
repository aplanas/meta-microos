SUMMARY = "A keybinding viewer for i3 and other programs"
DESCRIPTION = "A keybinding viewer for i3 and other programs."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.0"

RPM_NAME = "remontoire-1.4.0-1.13.aarch64.rpm"
RPM_HASH = "1f961961c66d41070858e0e7effde45fb5bbf459d1037b24b0e4e26c1958400ff0c6b517c8f5080f70a1ca1bb7c1aef083c30f15f10fdcff5b648ad5aef28c74"

RPROVIDES:${PN} += "application() \
application(org.regolith-linux.remontoire.desktop) \
metainfo() \
metainfo(org.regolith-linux.remontoire.appdata.xml) \
remontoire \
remontoire(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgdk-3.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit)"

inherit rpm
