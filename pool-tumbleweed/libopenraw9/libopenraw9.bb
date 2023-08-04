SUMMARY = "A library to decode digital camera RAW files"
DESCRIPTION = "libopenraw is a library that aim at decoding digital camera RAW files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.7"

RPM_NAME = "libopenraw9-0.3.7-1.1.aarch64.rpm"
RPM_HASH = "de06f734100d610eabbbd989e62a901697dba273b2505a2a382057438136e0c293d0b24e423c25ff0e1640ddda7fdfc8641b872f95115335a1cb45e9ec3bd243"

RPROVIDES:${PN} += "libopenraw.so.9 \
libopenraw9 \
libopenrawgnome.so.9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjpeg.so.8 \
libstdc++.so.6"

inherit rpm
