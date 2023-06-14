SUMMARY = "Library to parse EBML files"
DESCRIPTION = "libebml is a C++ library to parse EBML files. See the EBML RFC at \
http://www.matroska.org/technical/specs/rfc/index.html ."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.4"

RPM_NAME = "libebml5-1.4.4-1.3.aarch64.rpm"
RPM_HASH = "3ea5b4e457f8b29a9393a0213935c500a69c37d11317d74df9fdcaef6bb4a31c60e45fc78cea56d3c6f461037dcc1cd7eb3e13232511b4eec5d38599f7fa979e"

RPROVIDES:${PN} += "libebml.so.5 \
libebml5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
