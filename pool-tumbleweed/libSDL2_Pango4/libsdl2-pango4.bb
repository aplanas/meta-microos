SUMMARY = "Shared library for SDL2_Pango"
DESCRIPTION = "SDL2_Pango is a library for graphically rendering internationalized and tagged \
text in SDL2 using TrueType fonts. SDL2_Pango is a port of SDL_Pango to SDL2. \
 \
This package provides the shared library for SDL2_Pango."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.5"

RPM_NAME = "libSDL2_Pango4-2.1.5-1.3.aarch64.rpm"
RPM_HASH = "b481e538d22b085f9701e03648dc692611e44119904ba96f6fe51de7c83b81d8b94957562d1a2cadf05fc449d376961f71464dfa5eeedf81a1e289e2f46d6e3a"

RPROVIDES:${PN} += "libSDL2-Pango.so.4 \
libSDL2-Pango4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangoft2-1.0.so.0"

inherit rpm
