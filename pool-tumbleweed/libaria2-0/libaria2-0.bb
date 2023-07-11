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

RPM_NAME = "libaria2-0-1.36.0-1.12.aarch64.rpm"
RPM_HASH = "f49b0f098305b87b07671b8aafdde2033903f00ff3d2f18036eeecade0440dae02f4c9a599c9cc94513e3e34e1e9cb4abbc2a3ea02e90d76b86be8f6da50eedb"

RPROVIDES:${PN} += "libaria2-0 \
libaria2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcares.so.2 \
libgcc-s.so.1 \
libgmp.so.10 \
libgnutls.so.30 \
libm.so.6 \
libnettle.so.8 \
libsqlite3.so.0 \
libssh2.so.1 \
libstdc++.so.6 \
libuv.so.1 \
libxml2.so.2 \
libz.so.1"

inherit rpm
