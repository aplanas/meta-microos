SUMMARY = "Yet Another JSON Library"
DESCRIPTION = "YAJL is a small event-driven (SAX-style) JSON parser written in ANSI C, and a \
small validating JSON generator."
LICENSE = "ISC"

PV = "2.1.0"

RPM_NAME = "libyajl2-2.1.0-7.2.aarch64.rpm"
RPM_HASH = "5cabb2bbace09c799abe75a1dba118de0357c7a3927b2263aed8b3ce1f86d1044f3c3cc0bc656a2d96c952a5049b3c95584669a5faf8b7b6badc25e7da684776"

RPROVIDES:${PN} += "libyajl.so.2 \
libyajl2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
