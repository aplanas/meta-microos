SUMMARY = "GTK libfm libraries"
DESCRIPTION = "GTK system libraries for libfm"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "libfm-gtk4-1.3.2-1.13.aarch64.rpm"
RPM_HASH = "5e6bbdc438de98b21077798af2ab01d3c20f1bee865cdbf39591baab447bcb0e085f0410d493ba0ff39c6a925e6cd755232ddf24416f35d48e6844f70fa92739"

RPROVIDES:${PN} += "libfm-gtk.so.4 \
libfm-gtk4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libfm.so.4 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libmenu-cache.so.3 \
libpango-1.0.so.0"

inherit rpm
