SUMMARY = "Open Source OCR Engine"
DESCRIPTION = "A commercial quality OCR engine originally developed at HP between 1985 and \
1995. In 1995, this engine was among the top 3 evaluated by UNLV. It was \
open-sourced by HP and UNLV in 2005. From 2007 it is developed by Google."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "5.3.1"

RPM_NAME = "libtesseract5-5.3.1-1.1.aarch64.rpm"
RPM_HASH = "cc3ed56293d2286f27df3a102f97b6544742b08ff4cd47b8db7d244f41ce83b955e52a5d645dd9a412ae003cb631f8e3f54755699697b1ba4584f4dc5d1770f0"

RPROVIDES:${PN} += "libtesseract.so.5 \
libtesseract5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenCL.so.1 \
libarchive.so.13 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libgomp.so.1 \
libleptonica.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
