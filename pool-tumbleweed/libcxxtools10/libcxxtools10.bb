SUMMARY = "Collection of General-purpose C++ Classes"
DESCRIPTION = "Cxxtools is a collection of general-purpose C++ classes. The library \
includes classes for serialization, unicode text, multi threading, \
networking, rpc, http client and server, xml, logging and many more."
LICENSE = "LGPL-2.1-only"

PV = "3.0"

RPM_NAME = "libcxxtools10-3.0-4.6.aarch64.rpm"
RPM_HASH = "92fed16e2d09cc15be6d3f50a767ff201489839706bc2ce1ac29c84070205fde73253c27869fa1cbb50a1ec04923b825c8f64379e33cfb95ea6bde53388ab765"

RPROVIDES:${PN} += "libcxxtools.so.10 \
libcxxtools10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
