SUMMARY = "A C++ toolbox - testing library"
DESCRIPTION = "Cxxtools is a collection of general-purpose C++ classes. The library \
includes classes for serialization, unicode text, multi threading, \
networking, rpc, http client and server, xml, logging and many more."
LICENSE = "LGPL-2.1-only"

PV = "3.0"

RPM_NAME = "libcxxtools-unit10-3.0-4.5.aarch64.rpm"
RPM_HASH = "d7e455e7c28d7310fbe33ee5c16abe5579bbc164ae93c9d3e1cc21cf378eba3976d7d87223440cefeb0e9b3dfc68ef2c4033d98f6801c9928861fb5972872726"

RPROVIDES:${PN} += "libcxxtools-unit.so.10 \
libcxxtools-unit10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcxxtools.so.10 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
