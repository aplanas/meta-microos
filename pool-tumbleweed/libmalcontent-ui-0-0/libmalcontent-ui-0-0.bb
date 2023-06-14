SUMMARY = "Malcontent UI library"
DESCRIPTION = "Libmalcontent implements parental controls support which can be \
used by applications to filter or limit the access of child \
accounts to inappropriate content."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.10.4"

RPM_NAME = "libmalcontent-ui-0-0-0.10.4-1.5.aarch64.rpm"
RPM_HASH = "30f0f82238db6da0f4abb3f63b3625eb9e7e838c9d7b97c2d9c1dcab090b1c77ece2568d1e923e4803cc43411492b7cf7d7c5b7f7de4195ef002ae196d57f73a"

RPROVIDES:${PN} += "libmalcontent-ui-0-0 \
libmalcontent-ui-0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaccountsservice.so.0 \
libappstream-glib.so.8 \
libc.so.6 \
libflatpak.so.0 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libmalcontent-0.so.0"

inherit rpm
