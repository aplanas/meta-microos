SUMMARY = "Library to abstract stream and packet I/O"
DESCRIPTION = "This is gensio (pronounced gen'-see-oh), a framework for giving a \
consistent view of various stream (and packet) I/O types - osh support"
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.1-only"

PV = "2.6.1"

RPM_NAME = "libgensioosh0-2.6.1-1.4.aarch64.rpm"
RPM_HASH = "fc8082ce4ffd622e21a21e9824eeb5d9f97f275a057b513213a0f18d30009becab1b852d59a7b62ff86082cee33d9bb6eb7c34a0387eb26c1f398a18759675b4"

RPROVIDES:${PN} += "libgensioosh.so.0 \
libgensioosh0 \
libgensiooshcpp.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsctp.so.1 \
libstdc++.so.6"

inherit rpm
