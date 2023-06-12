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

RPM_NAME = "cmark-0.30.3-1.2.aarch64.rpm"
RPM_HASH = "f50b777844658f7bd6fe2a76cdba1cd9b3938cd6b66fc707cc38919a0ad74c9317b79703402e735c3a94cc2c6d4863f3ef48ce311a74f5134b2cde52e4ac8d3a"

RPROVIDES:${PN} += "cmark \
cmark(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcmark.so.0.30.3()(64bit)"

inherit rpm
