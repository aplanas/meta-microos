SUMMARY = "Open Source OCR Engine"
DESCRIPTION = "A commercial quality OCR engine originally developed at HP between 1985 and \
1995. In 1995, this engine was among the top 3 evaluated by UNLV. It was \
open-sourced by HP and UNLV in 2005. From 2007 it is developed by Google."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "5.3.0"

RPM_NAME = "libtesseract-5_3_0-5.3.0-3.4.aarch64.rpm"
RPM_HASH = "d59783d96d6914d6edf100045c83addd18823e73b65d4f63824bd2807b251700733e0a041879672fa22bec131db4a5ceb97978396e30eb34b84a863bbf499a79"

RPROVIDES:${PN} += "libtesseract-5-3-0 \
libtesseract.so.5.3.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libleptonica.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
