SUMMARY = "INI file parser for C"
DESCRIPTION = "Library to process config files in INI format into a libcollection data \
structure"
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "libini_config5-1.3.1-27.18.aarch64.rpm"
RPM_HASH = "acf581a51886d919f610e2dcc1250b7b6dc2e49108982008585cc296000a1ba4aabb8028bcebc47677cabf03f0c1ce9f5a76cc9934ad83d0ac2c4c78fac46c35"

RPROVIDES:${PN} += "libini-config.so.5 \
libini-config5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbasicobjects.so.0 \
libc.so.6 \
libcollection.so.4 \
libpath-utils.so.1 \
libref-array.so.1"

inherit rpm
