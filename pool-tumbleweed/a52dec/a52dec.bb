SUMMARY = "ATSC A/52 stream decoder library"
DESCRIPTION = "liba52 is a library for decoding ATSC A/52 streams."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.5+svn613"

RPM_NAME = "a52dec-0.7.5+svn613-3.16.aarch64.rpm"
RPM_HASH = "f0328ead0587ac4626e363e0c0727b418de64e7f82d17b0f6e15ac1e51cd36e96909b80bc3e6388af0b1a9c803273b300bfedad5431e9d588cca6e63a569db41"

RPROVIDES:${PN} += "a52 \
a52dec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
liba52-0 \
liba52.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
