SUMMARY = "INI file parser for C"
DESCRIPTION = "Library to process config files in INI format into a libcollection data \
structure"
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "libini_config5-1.3.1-27.18.aarch64.rpm"
RPM_HASH = "acf581a51886d919f610e2dcc1250b7b6dc2e49108982008585cc296000a1ba4aabb8028bcebc47677cabf03f0c1ce9f5a76cc9934ad83d0ac2c4c78fac46c35"

RPROVIDES:${PN} += "libini_config.so.5()(64bit) \
libini_config5 \
libini_config5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libbasicobjects.so.0()(64bit) \
libc.so.6()(64bit) \
libcollection.so.4()(64bit) \
libpath_utils.so.1()(64bit) \
libref_array.so.1()(64bit)"

inherit rpm
