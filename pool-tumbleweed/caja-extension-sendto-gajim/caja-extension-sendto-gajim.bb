SUMMARY = "Gajim integration for the Caja file manager"
DESCRIPTION = "This package provides Gajim integration to the Caja file manager."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "caja-extension-sendto-gajim-1.26.1-2.3.aarch64.rpm"
RPM_HASH = "75777255127c4c849f7edb2dbd524db739759a3565e11993375be28109608d776a6b9ad197aa6596fcae0dc06ad65be48b4e657dcb6dc59c5101dcdb2f2a7fc7"

RPROVIDES:${PN} += "caja-extension-sendto-gajim \
caja-sendto-gajim \
libnstgajim.so"

RDEPENDS:${PN} += "caja-extension-sendto \
gajim \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-glib-1.so.2 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
