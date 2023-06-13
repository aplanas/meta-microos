SUMMARY = "Shared library for aria2"
DESCRIPTION = "aria2 is a utility for downloading files. It has a segmented \
downloading engine in its core. It can download one file from \
multiple URLs or multiple connections from one URL. This can be used \
to speed up downloads with certain networks. The engine in was \
implemented in a single-thread model. \
 \
This package contains the shared library."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "1.36.0"

RPM_NAME = "libaria2-0-1.36.0-1.11.aarch64.rpm"
RPM_HASH = "8a2b756e8190280ac49681b9750ea5335c9626b9181e199ddd4d5c64d54d853c92dc0c7de007389fd9fe28ccbe189c9a0bcadbdee524ea5f0631a7110e90c31a"

RPROVIDES:${PN} += "libaria2-0 \
libaria2-0(aarch-64) \
libaria2.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcares.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgmp.so.10()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libm.so.6()(64bit) \
libnettle.so.8()(64bit) \
libnettle.so.8(NETTLE_8)(64bit) \
libsqlite3.so.0()(64bit) \
libssh2.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libuv.so.1()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit)"

inherit rpm
