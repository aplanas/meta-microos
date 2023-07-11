SUMMARY = "Graph partitioning library"
DESCRIPTION = "Mongoose is a graph partitioning library. Currently, Mongoose only \
supports edge partitioning. \
 \
mongoose is part of the SuiteSparse sparse matrix suite."
LICENSE = "GPL-3.0-only"

PV = "2.0.4"

RPM_NAME = "libmongoose2-2.0.4-49.2.aarch64.rpm"
RPM_HASH = "6a04401cb7a007a93476d7391e6f7e803db65b68681a60c5e4945a07ae19e0119c860ec7b92ad0d94ca099c47e716a2545837a3afaa53cbf7005ff9f6bbc0b27"

RPROVIDES:${PN} += "libldl-2-0-4 \
libmongoose.so.2 \
libmongoose2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libsuitesparseconfig.so.5"

inherit rpm
