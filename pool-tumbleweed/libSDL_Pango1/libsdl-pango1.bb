SUMMARY = "Programming Pango via SDL"
DESCRIPTION = "Pango is the text rendering engine of GNOME 2.x. SDL_Pango connects the \
engine to SDL."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.2"

RPM_NAME = "libSDL_Pango1-0.1.2-240.6.aarch64.rpm"
RPM_HASH = "e10883c7ffe54afaf781cc4c7f72c2e43a40f56d3f392efd3100e0b474603c8c7637c3c292ced050b0aee5bf9efa3fe1b710558872176530efa6257e7ebb955b"

RPROVIDES:${PN} += "libSDL-Pango.so.1 \
libSDL-Pango1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangoft2-1.0.so.0"

inherit rpm
