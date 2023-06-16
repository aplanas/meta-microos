SUMMARY = "Library for filesystem snapshot management"
DESCRIPTION = "This package contains libsnapper, a library for filesystem snapshot management."
LICENSE = "GPL-2.0-only"

PV = "0.10.4"

RPM_NAME = "libsnapper7-0.10.4-13.2.aarch64.rpm"
RPM_HASH = "19277569f1ae15c9d85788d8641d93a7bd76e2cd7675a2af3c65e46270a72bac67d429834bb8ab628bcba1b03cb6d0685bca0d887f42f927b8550a25af04e175"

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
