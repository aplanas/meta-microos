SUMMARY = "I/O library for dealing with structured file formats"
DESCRIPTION = "The libgsf library is an extensible I/O abstraction library for dealing \
with structured file formats."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.14.50"

RPM_NAME = "libgsf-1-114-1.14.50-1.5.aarch64.rpm"
RPM_HASH = "d701a5391d3d7e5891514eb3cd27bd86eaabbd6ecb97a37bbe412f08e4d078bc2c34426b3acbd1ddf52082efc81f3ed19567dc6ca23a7cedcd487c3ac4d91e11"

RPROVIDES:${PN} += "libgsf \
libgsf-1-114 \
libgsf-1-114(aarch-64) \
libgsf-1.so.114()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit)"

inherit rpm
