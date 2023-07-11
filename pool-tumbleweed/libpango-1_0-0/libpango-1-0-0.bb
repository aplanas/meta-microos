SUMMARY = "Library for Layout and Rendering of Text"
DESCRIPTION = "Pango is a library for layout and rendering of text, with an emphasis \
on internationalization. It can be used anywhere that text layout \
is needed. \
 \
Pango forms the core of text and font handling for GTK+."
LICENSE = "LGPL-2.1-or-later"

PV = "1.50.14"

RPM_NAME = "libpango-1_0-0-1.50.14-1.4.aarch64.rpm"
RPM_HASH = "2aebb7712fe7d729fa89591eb1a9337c684b2b536e84f4e88235fa86b7e131ea31fd5ad6e816e1852973971649b34b40310397c2e8fff7a027eba2b053501622"

RPROVIDES:${PN} += "libpango-1-0-0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpangoxft-1.0.so.0 \
pango \
pango-modules"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXft.so.2 \
libXrender.so.1 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
libfribidi.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libharfbuzz.so.0 \
libm.so.6 \
libthai.so.0"

inherit rpm
