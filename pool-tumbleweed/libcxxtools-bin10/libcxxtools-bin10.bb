SUMMARY = "A C++ toolbox - binary RPC package"
DESCRIPTION = "Cxxtools is a collection of general-purpose C++ classes. The library \
includes classes for serialization, unicode text, multi threading, \
networking, rpc, http client and server, xml, logging and many more."
LICENSE = "LGPL-2.1-only"

PV = "3.0"

RPM_NAME = "libcxxtools-bin10-3.0-4.5.aarch64.rpm"
RPM_HASH = "c0353d091d9a1654d17af0d4762f5d5ea0ba6207a4caab76a59a9d071f303a60f5184220fa88bebe767c1375a6ef04abcdbef7398d9190331531a51631b8b00e"

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
