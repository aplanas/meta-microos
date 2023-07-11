SUMMARY = "Parallelizing Multi-Protocol Utility for Downloading Files"
DESCRIPTION = "aria2 is a utility for downloading files. It has a segmented \
downloading engine in its core. It can download one file from \
multiple URLs or multiple connections from one URL. This can be used \
to speed up downloads with certain networks. The engine in was \
implemented in a single-thread model. \
 \
aria2 currently supports HTTP, FTP, and BitTorrent."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "1.36.0"

RPM_NAME = "aria2-1.36.0-1.12.aarch64.rpm"
RPM_HASH = "987016d8132e22c94e2d65a9e310febe2d2c5bcd873e617c8f2f6b3041a0be8a8fc2c1e859d90568436ad1bbe1ca307864a897d3369163bef47b64084352e037"

RPROVIDES:${PN} += "aria2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaria2.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
