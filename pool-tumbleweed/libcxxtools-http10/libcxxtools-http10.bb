SUMMARY = "A C++ toolbox - HTTP protocol implementation"
DESCRIPTION = "Cxxtools is a collection of general-purpose C++ classes. The library \
includes classes for serialization, unicode text, multi threading, \
networking, rpc, http client and server, xml, logging and many more."
LICENSE = "LGPL-2.1-only"

PV = "3.0"

RPM_NAME = "libcxxtools-http10-3.0-4.6.aarch64.rpm"
RPM_HASH = "bf22f7ced1e4f0bc51f8009ed6d8e6ca2e110ee5b95f8cf4b426fbeadfc54a1c1c8ef80faf01e704db17a1f6bf99d88e8b6ba07916f1a9329065ff2c62179fd6"

RPROVIDES:${PN} += "libcxxtools-http.so.10 \
libcxxtools-http10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcxxtools.so.10 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
