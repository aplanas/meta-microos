SUMMARY = "Parental control system"
DESCRIPTION = "Libmalcontent implements parental controls support which can be \
used by applications to filter or limit the access of child \
accounts to inappropriate content."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.10.4"

RPM_NAME = "malcontent-0.10.4-1.6.aarch64.rpm"
RPM_HASH = "c152484483be1732090168d22fb0c421f18a39b40311f37ea825b8ab9cd3c6b7dd129b24f7fc92cd8b21ce8c8023c9a4176f825c8809f12da369072b3e02dc51"

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
