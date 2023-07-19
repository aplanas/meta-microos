SUMMARY = "Library for filesystem snapshot management"
DESCRIPTION = "This package contains libsnapper, a library for filesystem snapshot management."
LICENSE = "GPL-2.0-only"

PV = "0.10.5"

RPM_NAME = "libsnapper7-0.10.5-2.1.aarch64.rpm"
RPM_HASH = "52da56cfd62c0496e9de6b0c57899acf594fb6963a969df3329aafd6af79d57d7fc7b900f0c5f8ff7e3ab30fc2b1ac210dd7fe5c6d138af699401336aa300146"

RPROVIDES:${PN} += "libsnapper.so.7 \
libsnapper7"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libboost-thread.so.1.82.0 \
libbtrfs.so.0 \
libbtrfsutil.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmount.so.1 \
libselinux.so.1 \
libstdc++.so.6 \
libxml2.so.2 \
libz.so.1 \
util-linux"

inherit rpm
