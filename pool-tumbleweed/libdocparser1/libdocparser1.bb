SUMMARY = "A document parser library"
DESCRIPTION = "docparser is a document parser library.It is ported from document2html."
LICENSE = "GPL-3.0+"

PV = "1.0.1"

RPM_NAME = "libdocparser1-1.0.1-1.7.aarch64.rpm"
RPM_HASH = "e1190fced2ae2241ee1f6ded9a445a86113d5507fa42a084a036f1e1425f0cbb3ffb9b7792ffe53393f59b1794427d9c559ed0c910fe0b6c7109e7d444173489"

RPROVIDES:${PN} += "libdocparser.so.1 \
libdocparser1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpoppler-cpp.so.0 \
libstdc++.so.6"

inherit rpm
