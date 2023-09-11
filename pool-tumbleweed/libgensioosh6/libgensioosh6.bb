SUMMARY = "Library to abstract stream and packet I/O"
DESCRIPTION = "This is gensio (pronounced gen'-see-oh), a framework for giving a \
consistent view of various stream (and packet) I/O types - osh support"
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.1-only"

PV = "2.7.5"

RPM_NAME = "libgensioosh6-2.7.5-1.1.aarch64.rpm"
RPM_HASH = "5100cf4364c734583512f123926c3825a266ed44c1003ebf070788d5c44ff292f62fcc00819a14be86ea0a339d729f2bd9b65afae959fd5a84bfc920acbf3ee6"

RPROVIDES:${PN} += "libgensioosh.so.6 \
libgensioosh6 \
libgensiooshcpp.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsctp.so.1 \
libstdc++.so.6"

inherit rpm
