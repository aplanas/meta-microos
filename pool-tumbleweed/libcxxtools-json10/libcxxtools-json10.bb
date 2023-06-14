SUMMARY = "A C++ toolbox - JSON package"
DESCRIPTION = "Cxxtools is a collection of general-purpose C++ classes. The library \
includes classes for serialization, unicode text, multi threading, \
networking, rpc, http client and server, xml, logging and many more."
LICENSE = "LGPL-2.1-only"

PV = "3.0"

RPM_NAME = "libcxxtools-json10-3.0-4.5.aarch64.rpm"
RPM_HASH = "cf239fc4f3711eb6948c7dc4aea42a9cbf4bf447d5778d5e72affdcd9c3facce53d02a7a971215792fe7d79622bc796e527318cb8a6020329aed1c1c0a1e470b"

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
