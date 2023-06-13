SUMMARY = "Navigator for finding and browsing system icons"
DESCRIPTION = "Lookbook is a browser for system icons. Icons can be grouped by \
category or be searched by icon name. Icons are shown in different \
sizes. A code snippet to use in programs can be displayed."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.0"

RPM_NAME = "lookbook-1.2.0-1.10.aarch64.rpm"
RPM_HASH = "fe769a1224a632036ad477883479dd31a09d7783bd5cdec9e5c472e912ec87deebc5fd2f1c1acbd55b708c716cbeb159786b2a8aa57ae8505d58b86cfca35e45"

RPROVIDES:${PN} += "application() \
application(com.github.danrabbit.lookbook.desktop) \
lookbook \
lookbook(aarch-64) \
metainfo() \
metainfo(com.github.danrabbit.lookbook.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgranite.so.6()(64bit) \
libgtk-3.so.0()(64bit) \
libgtksourceview-4.so.0()(64bit) \
libhandy-1.so.0()(64bit) \
libhandy-1.so.0(LIBHANDY_1_0)(64bit)"

inherit rpm
