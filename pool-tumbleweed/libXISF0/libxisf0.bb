SUMMARY = "Library to read/write PixInsight XISF files"
DESCRIPTION = "C++ library that can read and write XISF files produced by PixInsight."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.6"

RPM_NAME = "libXISF0-0.2.6-1.1.aarch64.rpm"
RPM_HASH = "ce9a852e914ec50ffd91bee6d9f31b7bf53def905d58dc8dfc4b04bcc062c27154eaac57fb0902a345e5b7b3b9a86823d70e5d89e88242ac4e28bca3b23884a3"

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
