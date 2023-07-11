SUMMARY = "Redmond GTK+ 2 Theme Engine"
DESCRIPTION = "The Redmond engine and theme are designed to mimic the appearance of \
another well known OS."
LICENSE = "LGPL-2.1+"

PV = "2.20.2"

RPM_NAME = "gtk2-engine-redmond95-2.20.2-19.43.aarch64.rpm"
RPM_HASH = "c2aee28ba1e057d077e38bfab808cd959e088c9b18af916f8799002bf27d7e21992ffa1c68d5caf56621c7da88c3bd39cd7f98d8c17e2b12697900c4014c6a67"

RPROVIDES:${PN} += "gtk2-engine-redmond95 \
libredmond95.so"

RDEPENDS:${PN} += "gtk2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
