SUMMARY = "Yet Another JSON Library"
DESCRIPTION = "YAJL is a small event-driven (SAX-style) JSON parser written in ANSI C, and a \
small validating JSON generator."
LICENSE = "ISC"

PV = "2.1.0"

RPM_NAME = "libyajl2-2.1.0-8.1.aarch64.rpm"
RPM_HASH = "33d90b35bc87b369533401ba4fb8fd509969caa07ae644c02d3d65fc7aa538dea3707d3ff4914a5094f825ec705eb07a0fddeaa68aeff0b97d65888ced07bff4"

RPROVIDES:${PN} += "libyajl.so.2 \
libyajl2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
