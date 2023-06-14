SUMMARY = "Shared object for GTK3 hosts displaying X11 LV2 GUIs"
DESCRIPTION = "Module plugin for: \
* GTK3 hosts displaying X11 LV2 GUIs using suil"
LICENSE = "ISC"

PV = "0.10.18"

RPM_NAME = "suil-plugin-x11-in-gtk3-0.10.18-1.1.aarch64.rpm"
RPM_HASH = "1a816a469e076a1ebc910251f9936dc07ad992e5c4ace77c56880393ab8ad3e8155c0679e9cdd812188812355994d0060a15bcb91b8c314c3d2772e0552f69c5"

RPROVIDES:${PN} += "libsuil-x11-in-gtk3.so \
suil-plugin-x11-in-gtk3"

RDEPENDS:${PN} += "gtk3-tools \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libsuil-0-0"

inherit rpm
