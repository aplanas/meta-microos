SUMMARY = "A C++ toolbox - XMLRPC package"
DESCRIPTION = "Cxxtools is a collection of general-purpose C++ classes. The library \
includes classes for serialization, unicode text, multi threading, \
networking, rpc, http client and server, xml, logging and many more."
LICENSE = "LGPL-2.1-only"

PV = "3.0"

RPM_NAME = "libcxxtools-xmlrpc10-3.0-4.5.aarch64.rpm"
RPM_HASH = "67b386115176c45fd6148b89dec71df55dfbe19265f53e2e4bdef20964132afb069dc459cb11a20d46919df08a190b585208d238b6f735a8576a7883cbd85b19"

RPROVIDES:${PN} += "libcxxtools-xmlrpc.so.10 \
libcxxtools-xmlrpc10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcxxtools-http.so.10 \
libcxxtools.so.10 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
