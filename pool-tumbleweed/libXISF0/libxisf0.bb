SUMMARY = "Library to read/write PixInsight XISF files"
DESCRIPTION = "C++ library that can read and write XISF files produced by PixInsight."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.9"

RPM_NAME = "libXISF0-0.2.9-1.1.aarch64.rpm"
RPM_HASH = "0d6f6ebe3a7f4e81921c6baa20801a75d0db857a2a7962d0e6f127c661c82e6320df4ed070a5d908a203b01cdc639771410c3979968f7da6594db712cf0c926d"

RPROVIDES:${PN} += "libXISF.so.0 \
libXISF0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblz4.so.1 \
libpugixml.so.1 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
