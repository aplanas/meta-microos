SUMMARY = "Library to abstract stream and packet I/O"
DESCRIPTION = "This is gensio (pronounced gen'-see-oh), a framework for giving a \
consistent view of various stream (and packet) I/O types - osh support"
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.1-only"

PV = "2.6.1"

RPM_NAME = "libgensioosh0-2.6.1-1.4.aarch64.rpm"
RPM_HASH = "fc8082ce4ffd622e21a21e9824eeb5d9f97f275a057b513213a0f18d30009becab1b852d59a7b62ff86082cee33d9bb6eb7c34a0387eb26c1f398a18759675b4"

RPROVIDES:${PN} += "libgensioosh.so.0()(64bit) \
libgensioosh0 \
libgensioosh0(aarch-64) \
libgensiooshcpp.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libsctp.so.1()(64bit) \
libsctp.so.1(VERS_1)(64bit) \
libsctp.so.1(VERS_3)(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
