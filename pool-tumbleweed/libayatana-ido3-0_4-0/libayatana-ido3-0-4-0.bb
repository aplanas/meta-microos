SUMMARY = "Shared library providing extra GTK menu items in system indicators"
DESCRIPTION = "Shared library providing extra GTK menu items for display in \
system indicators. \
 \
This package contains shared libraries."
LICENSE = "GPL-3.0-only & LGPL-3.0-only & LGPL-2.1-only"

PV = "0.9.2"

RPM_NAME = "libayatana-ido3-0_4-0-0.9.2-1.4.aarch64.rpm"
RPM_HASH = "dc65587d3a3e720f367443a160dad2fe0b55c8fa9cc420954905d53e565ec85685e80d50cba49e14d484842edb981861d8e685db3325a40981e7af50294698c5"

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
