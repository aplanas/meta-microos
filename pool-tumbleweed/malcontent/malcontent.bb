SUMMARY = "Parental control system"
DESCRIPTION = "Libmalcontent implements parental controls support which can be \
used by applications to filter or limit the access of child \
accounts to inappropriate content."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.10.4"

RPM_NAME = "malcontent-0.10.4-1.5.aarch64.rpm"
RPM_HASH = "21d386f4457afff9f2395ba32bb414b02936c177556467ac8aac5b40051afc5591506f554780afcdaed731dfee969a737b40fbafad703368a1499cdd43e31dcf"

RPROVIDES:${PN} += "malcontent"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmalcontent-0.so.0 \
libpam.so.0 \
typelib-GLib \
typelib-Gio \
typelib-Malcontent"

inherit rpm
