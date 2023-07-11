SUMMARY = "Hamachi Network Manager"
DESCRIPTION = "Haguichi provides a graphical frontend for Hamachi. \
It features customizable commands, notification bubbles, tooltips, along with a \
searchable, sortable and collapsible network list. It also can backup and \
restore the Hamachi configuration directory."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.6"

RPM_NAME = "haguichi-1.4.6-1.2.aarch64.rpm"
RPM_HASH = "331121a70750280d54f7914b8eccdf41bcdecc26c0e1b89e5a20ba86c844ad126c6840eea16ec56fdea8f2689dbcf554169aec275e366178b48c6ada6b0486d2"

RPROVIDES:${PN} += "haguichi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
