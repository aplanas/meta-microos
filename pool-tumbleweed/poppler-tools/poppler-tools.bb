SUMMARY = "PDF Rendering Library Tools"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.06.0"

RPM_NAME = "poppler-tools-23.06.0-1.1.aarch64.rpm"
RPM_HASH = "6f65f510da90255f5fb5a020e5622d6c74e56fb0917ea389169e19397efef3ab3ebbd8012ce525f28b5b66745fa1245ad5371bf5542e118dc9c356d7e27c4e08"

RPROVIDES:${PN} += "poppler-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
liblcms2.so.2 \
libm.so.6 \
libpoppler.so.129 \
libpoppler129 \
libstdc++.so.6"

inherit rpm
