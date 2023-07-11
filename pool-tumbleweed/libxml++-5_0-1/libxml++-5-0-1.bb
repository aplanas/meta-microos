SUMMARY = "C++ Interface for XML Files"
DESCRIPTION = "libXML++ provides a C++ interface for XML files. It presently uses \
libxml2 to access the XML files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.3"

RPM_NAME = "libxml++-5_0-1-5.0.3-1.3.aarch64.rpm"
RPM_HASH = "815134806b67d3c9a300c8b50e09f3c1316595f4a95d737c26ab346afa75668d90b3ae90109438a0cf3d1b4896949c87a16609f14ab565c2cb9f6d79a10a0b23"

RPROVIDES:${PN} += "libxml++ \
libxml++-5-0-1 \
libxml++-5.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxml2.so.2"

inherit rpm
