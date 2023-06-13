SUMMARY = "PDF Rendering Library Tools"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.05.0"

RPM_NAME = "poppler-tools-23.05.0-1.1.aarch64.rpm"
RPM_HASH = "b4166cad53761054239fefe376561c7da6b2880c610d90c6dd842b6b34e78637f43304c4fb748fa4322867aff1c9d9046b2c0b2f5eab4909e3ab0dfebbd0a503"

RPROVIDES:${PN} += "poppler-tools \
poppler-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libfreetype.so.6()(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libpoppler.so.128()(64bit) \
libpoppler128 \
libstdc++.so.6()(64bit)"

inherit rpm
