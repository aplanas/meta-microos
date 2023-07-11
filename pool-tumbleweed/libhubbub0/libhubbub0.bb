SUMMARY = "An HTML5 compliant parsing library"
DESCRIPTION = "Hubbub is an HTML5 compliant parsing library, written in C. It was \
developed as part of the NetSurf project. \
 \
The HTML5 specification defines a parsing algorithm, based on the \
behaviour of mainstream browsers, which provides instructions for how to \
parse all markup, both valid and invalid. As a result, Hubbub parses web \
content well. \
 \
Features: \
* Parses HTML, good and bad \
* Simple C API \
* Fast \
* Character encoding detection \
* Well-tested (~90% test coverage) \
* Portable"
LICENSE = "MIT"

PV = "0.3.7"

RPM_NAME = "libhubbub0-0.3.7-2.10.aarch64.rpm"
RPM_HASH = "2b0ec7d6f56925143996746e7a7b3f5f2535c460e91f5f88e46c24b37b2fb4e759306cd1f3446db53cbc0e8ea5b471cf6494206bf243f7108524ec100877c9a6"

RPROVIDES:${PN} += "libhubbub.so.0 \
libhubbub0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libparserutils.so.0"

inherit rpm
