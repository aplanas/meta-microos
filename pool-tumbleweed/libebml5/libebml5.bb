SUMMARY = "Library to parse EBML files"
DESCRIPTION = "libebml is a C++ library to parse EBML files. See the EBML RFC at \
http://www.matroska.org/technical/specs/rfc/index.html ."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.4"

RPM_NAME = "libebml5-1.4.4-1.4.aarch64.rpm"
RPM_HASH = "75669afa4ea84d68023d156b308c3774275479676b3c0cd0aba144bc1e5f45f6d52030aa8a0aef8c7d5b31f3621c8a5a5b2db7d3b674b8872fa599715bd086b9"

RPROVIDES:${PN} += "libebml.so.5 \
libebml5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
