SUMMARY = "Open Source OCR Engine"
DESCRIPTION = "A commercial quality OCR engine originally developed at HP between 1985 and \
1995. In 1995, this engine was among the top 3 evaluated by UNLV. It was \
open-sourced by HP and UNLV in 2005. From 2007 it is developed by Google."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "5.3.1"

RPM_NAME = "tesseract-ocr-5.3.1-1.1.aarch64.rpm"
RPM_HASH = "139ecb10b44c3e9ff9cbcce29e1ad23c9ca110a9c8cfa1667071bb5826bbfc65ab68a299c892fdee528ee0b5dad5bdd49a3126573f02a88a2c97193a9fb4a469"

RPROVIDES:${PN} += "tesseract-ocr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOpenCL.so.1 \
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
libtesseract.so.5"

inherit rpm
