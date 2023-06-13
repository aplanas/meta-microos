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

RPM_NAME = "libhubbub0-0.3.7-2.9.aarch64.rpm"
RPM_HASH = "592595c2a550d7c990cf9732a78bdc5a2ff6e529be00711976a7680082d105d8f27fd25af1eabed0d96a6f8a6a9834617980a17c4bf3f04642f92cc221e536b2"

RPROVIDES:${PN} += "libhubbub.so.0()(64bit) \
libhubbub0 \
libhubbub0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libparserutils.so.0()(64bit)"

inherit rpm
