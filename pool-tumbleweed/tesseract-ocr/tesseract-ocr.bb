SUMMARY = "Open Source OCR Engine"
DESCRIPTION = "A commercial quality OCR engine originally developed at HP between 1985 and \
1995. In 1995, this engine was among the top 3 evaluated by UNLV. It was \
open-sourced by HP and UNLV in 2005. From 2007 it is developed by Google."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "5.3.0"

RPM_NAME = "tesseract-ocr-5.3.0-3.4.aarch64.rpm"
RPM_HASH = "2d49e7132115d1d5cbaf92d005fae83639f723c8fe9e0ebe9eb9ee6c753f50628ed36d52b0cfac4dff71e7596ab14d308d297defcbaabfe8b603f11991e1807a"

RPROVIDES:${PN} += "libcommon-training.so \
libpango-training.so \
libunicharset-training.so \
tesseract-ocr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libcairo.so.2 \
libcurl.so.4 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libharfbuzz.so.0 \
libicui18n.so.73 \
libicuuc.so.73 \
libleptonica.so.6 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstdc++.so.6 \
libtesseract.so.5.3.0"

inherit rpm
