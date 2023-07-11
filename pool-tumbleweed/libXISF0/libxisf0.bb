SUMMARY = "Library to read/write PixInsight XISF files"
DESCRIPTION = "C++ library that can read and write XISF files produced by PixInsight."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.8"

RPM_NAME = "libXISF0-0.2.8-1.1.aarch64.rpm"
RPM_HASH = "7a6dd1b04bf5962b8b085aa04451584c3380fc6b6a407f0999959d20a8e1c6f4f7aa3cf2a89fb22287cb8d21e127dd4d371aa3895abe6b45869ffbc73c6b1478"

RPROVIDES:${PN} += "libXISF.so.0 \
libXISF0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblz4.so.1 \
libpugixml.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
