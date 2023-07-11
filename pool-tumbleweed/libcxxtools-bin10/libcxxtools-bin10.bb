SUMMARY = "A C++ toolbox - binary RPC package"
DESCRIPTION = "Cxxtools is a collection of general-purpose C++ classes. The library \
includes classes for serialization, unicode text, multi threading, \
networking, rpc, http client and server, xml, logging and many more."
LICENSE = "LGPL-2.1-only"

PV = "3.0"

RPM_NAME = "libcxxtools-bin10-3.0-4.6.aarch64.rpm"
RPM_HASH = "5f73fdaf69dbac67cfcb3bbbbf2135e5dd1fb154f11c89a5a6b6887431d0e746de01bf923528f7d2dd59470dcbb681d13fa7ea83d53f0592fadd64868830d22e"

RPROVIDES:${PN} += "libcxxtools-bin.so.10 \
libcxxtools-bin10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcxxtools.so.10 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
