SUMMARY = "GNU Unicode string library"
DESCRIPTION = "This portable C library implements Unicode string types in three flavours: \
(UTF-8, UTF-16, UTF-32), together with functions for character processing \
(names, classifications, properties) and functions for string processing \
(iteration, formatted output, width, word breaks, line breaks, normalization, \
case folding and regular expressions)."
LICENSE = "GPL-3.0-or-later | LGPL-3.0-or-later"

PV = "1.1"

RPM_NAME = "libunistring5-1.1-3.1.aarch64.rpm"
RPM_HASH = "4e154919270b6094e2d15d815f0e7eec1cecdeeb9912ec5cbb1304d3078801de76cef6f0d75344e5a913249afbcc5c0c43320eb721e0753970458174076e1d51"

RPROVIDES:${PN} += "libunistring.so.5 \
libunistring5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
