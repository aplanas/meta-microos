SUMMARY = "Bogofilter kyotocabinet backend"
DESCRIPTION = "This package contains bogofilter build with the tokyocabinet backend."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.4"

RPM_NAME = "bogofilter-kyotocabinet-1.2.4-15.12.aarch64.rpm"
RPM_HASH = "c63c1bbbd5b822b31720303cff163fde41b788ba338997dbf8db397664bfbaf775a050e03362839da249cffc3a94bba0a675dec7172a47d3b17f96d7c2dca685"

RPROVIDES:${PN} += "bogofilter-backend \
bogofilter-kyotocabinet \
bogofilter-kyotocabinet(aarch-64) \
bogofilter-tokyocabinet"

RDEPENDS:${PN} += "/bin/sh \
bogofilter-common \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libgsl.so.27()(64bit) \
libgslcblas.so.0()(64bit) \
libkyotocabinet.so.16()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
update-alternatives"

inherit rpm
