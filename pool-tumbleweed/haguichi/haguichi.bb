SUMMARY = "Hamachi Network Manager"
DESCRIPTION = "Haguichi provides a graphical frontend for Hamachi. \
It features customizable commands, notification bubbles, tooltips, along with a \
searchable, sortable and collapsible network list. It also can backup and \
restore the Hamachi configuration directory."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.6"

RPM_NAME = "haguichi-1.4.6-1.1.aarch64.rpm"
RPM_HASH = "4db735d8bd7ea27da554f540dd902755871a10c7a157b6d449b7d0c8a032de8f22c2e9a37f97d9707202c91347e81e51b13cebf39e15a4e27f54bc212f777260"

RPROVIDES:${PN} += "application() \
application(com.github.ztefn.haguichi.desktop) \
haguichi \
haguichi(aarch-64) \
metainfo() \
metainfo(com.github.ztefn.haguichi.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
