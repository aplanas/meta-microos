SUMMARY = "Library for the Plank dock"
DESCRIPTION = "Plank is a trivial dock. \
It is, however, a library which can be extended to create other \
dock programs with more advanced features."
LICENSE = "GPL-3.0-or-later"

PV = "0.11.89"

RPM_NAME = "libplank1-0.11.89-2.4.aarch64.rpm"
RPM_HASH = "9ea0061d611e80c8fac2e8adf1bbf58cf342ee99cd286ea6cff7839afaa0a88ec310738f4a2765656c9ad6cfaa8fc062d2e51f33b2443cb793cdb68fc41f3488"

RPROVIDES:${PN} += "libplank.so.1 \
libplank1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libbamf3.so.2 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libdbusmenu-glib.so.4 \
libdbusmenu-gtk3.so.4 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libwnck-3.so.0"

inherit rpm
