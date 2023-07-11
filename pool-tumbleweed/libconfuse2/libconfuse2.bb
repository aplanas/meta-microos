SUMMARY = "A configuration file parser library"
DESCRIPTION = "libConfuse is a configuration file parser library. It supports \
sections and (lists of) values (strings, integers, floats, booleans \
or other sections), as well as single/double-quoted strings, \
environment variable expansion, functions and nested include \
statements."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3"

RPM_NAME = "libconfuse2-3.3-2.4.aarch64.rpm"
RPM_HASH = "5cf38df596efb0b20842262c5007a13ddceddf3f7dea601de3f13177e2f553525234720cd6ee17728eda3d07d095b803aedf2ca6957ccbab2fad2490a70878af"

RPROVIDES:${PN} += "libconfuse.so.2 \
libconfuse2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
