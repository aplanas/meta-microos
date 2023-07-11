SUMMARY = "Library for filesystem snapshot management"
DESCRIPTION = "This package contains libsnapper, a library for filesystem snapshot management."
LICENSE = "GPL-2.0-only"

PV = "0.10.5"

RPM_NAME = "libsnapper7-0.10.5-1.1.aarch64.rpm"
RPM_HASH = "d472621e6238d39089474c3d7699002e88ab5ad2f5b5aee8e684c6fcd24ceae1f10a8a129f363433c094322dc79afceba577f34064e1e9de5d5545d89225a5a7"

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
