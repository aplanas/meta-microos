SUMMARY = "CmmonMark parsing and rendering library"
DESCRIPTION = "It provides a shared library (`libcmark`) with functions for parsing \
CommonMark documents to an abstract syntax tree (AST), manipulating \
the AST, and rendering the document to HTML, groff man, LaTeX, \
CommonMark, or an XML representation of the AST.  It also provides a \
command-line program (`cmark`) for parsing and rendering CommonMark \
documents."
LICENSE = "BSD-2-Clause & MIT & CC-BY-SA-4.0"

PV = "0.30.3"

RPM_NAME = "libcmark0_30_3-0.30.3-1.3.aarch64.rpm"
RPM_HASH = "e4124176b9500084dcb415af68098ba240d60baad6f24bdbd6cd73919449fd736479bd9fedf97909fc733cb57b8c9e40c788a6e73464fbfd09c0224cedfc718e"

RPROVIDES:${PN} += "libcmark.so.0.30.3 \
libcmark0-30-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
