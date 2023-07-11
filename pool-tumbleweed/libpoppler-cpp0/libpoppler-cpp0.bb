SUMMARY = "C++ API of the Poppler PDF rendering library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.06.0"

RPM_NAME = "libpoppler-cpp0-23.06.0-1.1.aarch64.rpm"
RPM_HASH = "ef372a67bb7fcba5caab4c84efa3d364bc51b0aa80a5faefd21bd0bc8cad26dfcb80b1684797a1047de79229883b48bf30ce7ab1c17f2b07d673c4b97668cf3f"

RPROVIDES:${PN} += "libpoppler-cpp.so.0 \
libpoppler-cpp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpoppler.so.129 \
libstdc++.so.6"

inherit rpm
