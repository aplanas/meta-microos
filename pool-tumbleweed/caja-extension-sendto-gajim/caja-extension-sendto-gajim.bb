SUMMARY = "Gajim integration for the Caja file manager"
DESCRIPTION = "This package provides Gajim integration to the Caja file manager."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "caja-extension-sendto-gajim-1.26.1-2.3.aarch64.rpm"
RPM_HASH = "75777255127c4c849f7edb2dbd524db739759a3565e11993375be28109608d776a6b9ad197aa6596fcae0dc06ad65be48b4e657dcb6dc59c5101dcdb2f2a7fc7"

RPROVIDES:${PN} += "caja-extension-sendto-gajim \
caja-extension-sendto-gajim(aarch-64) \
caja-sendto-gajim \
libnstgajim.so()(64bit)"
RDEPENDS:${PN} += "caja-extension-sendto \
gajim \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdbus-glib-1.so.2()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
