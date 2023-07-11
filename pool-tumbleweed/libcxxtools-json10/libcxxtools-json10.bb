SUMMARY = "A C++ toolbox - JSON package"
DESCRIPTION = "Cxxtools is a collection of general-purpose C++ classes. The library \
includes classes for serialization, unicode text, multi threading, \
networking, rpc, http client and server, xml, logging and many more."
LICENSE = "LGPL-2.1-only"

PV = "3.0"

RPM_NAME = "libcxxtools-json10-3.0-4.6.aarch64.rpm"
RPM_HASH = "3592735d7db5bc1b9df2764da738a4b8ff6b497ba39dd9d3be81d16043ad7686d627e5392d621428fd963722f1c5ccd686a80832649c0ea9edb82f509062990b"

RPROVIDES:${PN} += "libcxxtools-json.so.10 \
libcxxtools-json10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcxxtools-http.so.10 \
libcxxtools.so.10 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
