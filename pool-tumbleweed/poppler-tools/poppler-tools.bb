SUMMARY = "PDF Rendering Library Tools"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.07.0"

RPM_NAME = "poppler-tools-23.07.0-1.1.aarch64.rpm"
RPM_HASH = "73de5ec8d185512bfdfa1b05fd1af4028bab050429cb48bd7bed8e5e22afcb911913ca9120db6361b1eac879569a47af96c9d861169de413693d083105a809a8"

RPROVIDES:${PN} += "poppler-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
liblcms2.so.2 \
libm.so.6 \
libpoppler.so.130 \
libpoppler130 \
libstdc++.so.6"

inherit rpm
