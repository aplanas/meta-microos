SUMMARY = "Tools for pango, a library for text layout and rendering"
DESCRIPTION = "Pango is a library for layout and rendering of text, with an emphasis \
on internationalization. It can be used anywhere that text layout \
is needed. \
 \
Pango forms the core of text and font handling for GTK+."
LICENSE = "LGPL-2.1-or-later"

PV = "1.50.14"

RPM_NAME = "pango-tools-1.50.14-1.3.aarch64.rpm"
RPM_HASH = "c0c149d414d2c31eb63b7d456253b3cf87684f219fc0ade9b5b3285138cb7704892e473b6b8f4dafc1a1d73e5cbe8c12e1858f021990f92b1fb9d756c19b9576"

RPROVIDES:${PN} += "pango-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXft.so.2 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libharfbuzz.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpangoxft-1.0.so.0"

inherit rpm
