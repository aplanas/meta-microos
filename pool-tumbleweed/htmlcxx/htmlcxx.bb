SUMMARY = "HTML and CSS APIs for C++"
DESCRIPTION = "This is a simple non-validating css1 and html parser for C++. Although there are several other html parsers available, htmlcxx has some characteristics that make it unique: \
 \
- STL like navigation of DOM tree, using excelent's tree.hh library from Kasper Peeters \
- It is possible to reproduce exactly, character by character, the original document from the parse tree \
- Bundled css parser \
- Optional parsing of attributes \
- C++ code that looks like C++ (not so true anymore) \
- Offsets of tags/elements in the original document are stored in the nodes of the DOM tree"
LICENSE = "LGPL-2.0-only & Apache-2.0"

PV = "0.87"

RPM_NAME = "htmlcxx-0.87-2.9.aarch64.rpm"
RPM_HASH = "71f4372eca3379c02dc3f3108dc2f67060a0895319374288969ccade49f74c1a9d5cac55c164a3072b4d064f5639376d274a78ba1b964fee5ed8c81ce0810442"

RPROVIDES:${PN} += "htmlcxx \
libcss-parser-pp.so.0 \
libcss-parser.so.0 \
libhtmlcxx.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
