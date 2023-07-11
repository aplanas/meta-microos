SUMMARY = "Library to abstract stream and packet I/O"
DESCRIPTION = "This is gensio (pronounced gen'-see-oh), a framework for giving a \
consistent view of various stream (and packet) I/O types - osh support"
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.1-only"

PV = "2.6.1"

RPM_NAME = "libgensioosh0-2.6.1-1.6.aarch64.rpm"
RPM_HASH = "24805fd7cc741d00ba99e098280982b145365c4fc2c6bf284b35fba3e363644c3dba6311d3537046e98ce167fd3030cbb205aa05dacff896d37fdd8a60d877d3"

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
