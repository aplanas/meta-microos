SUMMARY = "CommonMark parsing and rendering library and program in C"
DESCRIPTION = "`cmark` is the C reference implementation of CommonMark, \
a rationalized version of Markdown syntax with a spec. \
 \
It provides a shared library (`libcmark`) with functions for parsing \
CommonMark documents to an abstract syntax tree (AST), manipulating \
the AST, and rendering the document to HTML, groff man, LaTeX, \
CommonMark, or an XML representation of the AST.  It also provides a \
command-line program (`cmark`) for parsing and rendering CommonMark \
documents."
LICENSE = "BSD-2-Clause & MIT & CC-BY-SA-4.0"

PV = "0.30.3"

RPM_NAME = "cmark-0.30.3-1.3.aarch64.rpm"
RPM_HASH = "827b7559f109894ce946c27e0dc963b9ead4df7b1676a83eb1048af09adec722db01c30883712c769a7104e4bc65bf271dc5980c812b6feac936320ebf5bded2"

RPROVIDES:${PN} += "cmark"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcmark.so.0.30.3"

inherit rpm
