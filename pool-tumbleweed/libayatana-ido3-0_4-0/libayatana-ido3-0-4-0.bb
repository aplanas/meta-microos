SUMMARY = "Shared library providing extra GTK menu items in system indicators"
DESCRIPTION = "Shared library providing extra GTK menu items for display in \
system indicators. \
 \
This package contains shared libraries."
LICENSE = "GPL-3.0-only & LGPL-3.0-only & LGPL-2.1-only"

PV = "0.9.2"

RPM_NAME = "libayatana-ido3-0_4-0-0.9.2-1.5.aarch64.rpm"
RPM_HASH = "ab250aebd7a2bf2465d0e401a2fc14e9ce8283e150b3a14241dfccbd2906b31a0f9a75cc9cbca918c7696662e463efebde6052f7ac6e0dabc4f855689e5ca9cc"

RPROVIDES:${PN} += "libayatana-ido3-0-4-0 \
libayatana-ido3-0.4.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
