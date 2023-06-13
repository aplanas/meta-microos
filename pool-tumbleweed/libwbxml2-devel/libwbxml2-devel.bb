SUMMARY = "WBXML parser and compiler library"
DESCRIPTION = "wbxml2 is a library that includes a WBXML (Wireless Binary XML) \
parser and a WBXML compiler. Unlike wbxml, it uses expat instead of \
libxml2. WBXML contains a library and its associated tools to parse, \
ecode and handle WBXML documents."
LICENSE = "LGPL-2.1-or-later"

PV = "0.11.8"

RPM_NAME = "libwbxml2-devel-0.11.8-1.2.aarch64.rpm"
RPM_HASH = "001271529c5b4aa9055e359303b3946022c3b9fe7a6a1e40098284a7914747147e698c508e85833db2fc09a0100d403d16a029665bdd4806923738acff78fb75"

RPROVIDES:${PN} += "libwbxml2-devel \
libwbxml2-devel(aarch-64) \
pkgconfig(libwbxml2)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libexpat-devel \
libwbxml2-1 \
pkgconfig(expat)"

inherit rpm
