SUMMARY = "A C++ toolbox - testing library"
DESCRIPTION = "Cxxtools is a collection of general-purpose C++ classes. The library \
includes classes for serialization, unicode text, multi threading, \
networking, rpc, http client and server, xml, logging and many more."
LICENSE = "LGPL-2.1-only"

PV = "3.0"

RPM_NAME = "libcxxtools-unit10-3.0-4.6.aarch64.rpm"
RPM_HASH = "d011fb53cd464247ca46d6a61336b98b03e5549194a524044ba43a2d3fae1ed114e0ea5a4d7587a7e2a2b610303f4ea6d3299803814389b594a9bed92baf3e54"

RPROVIDES:${PN} += "libcxxtools-unit.so.10 \
libcxxtools-unit10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcxxtools.so.10 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
