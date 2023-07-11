SUMMARY = "Simple glyph viewer"
DESCRIPTION = "Simple glyph viewer \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ftview-2.13.0-4.2.aarch64.rpm"
RPM_HASH = "eed62e87270fcea130e50b10ad5cd673b1efcc8cfd3ccdf5e74f17ada1080f0a3874ad17d815fa11890573781a9fa119ba9e2fe52239152bb59503cae9c91eec"

RPROVIDES:${PN} += "ftview"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
libgobject-2.0.so.0 \
libpng16.so.16 \
librsvg-2.so.2"

inherit rpm
