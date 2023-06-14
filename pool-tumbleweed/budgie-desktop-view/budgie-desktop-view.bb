SUMMARY = "Official Budgie Desktop icons application / implementation"
DESCRIPTION = "Budgie Desktop View is the official Budgie desktop icons application / implementation"
LICENSE = "Apache-2.0"

PV = "1.2.1+0"

RPM_NAME = "budgie-desktop-view-1.2.1+0-1.3.aarch64.rpm"
RPM_HASH = "dbcec0ecce75b97db1bea402d96a1db6908ae5731b492aa306228c62850f1d3b982da469233ca6b5d9615f8ed3d80708b63621dcc7f9735769fc3c2d4952ff28"

RPROVIDES:${PN} += "budgie-desktop-view"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
