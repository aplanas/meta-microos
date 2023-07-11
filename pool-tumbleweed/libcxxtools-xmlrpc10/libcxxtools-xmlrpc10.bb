SUMMARY = "A C++ toolbox - XMLRPC package"
DESCRIPTION = "Cxxtools is a collection of general-purpose C++ classes. The library \
includes classes for serialization, unicode text, multi threading, \
networking, rpc, http client and server, xml, logging and many more."
LICENSE = "LGPL-2.1-only"

PV = "3.0"

RPM_NAME = "libcxxtools-xmlrpc10-3.0-4.6.aarch64.rpm"
RPM_HASH = "d22756783becf39822f90f812b902d8f4191c9d4b7c1ee45e276012f7f11bc2ba8d3e6188eb411875b6533164c1e0fa9a5292bba26d842e1136fbdddd0850124"

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
