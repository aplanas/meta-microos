SUMMARY = "Graph partitioning library"
DESCRIPTION = "Mongoose is a graph partitioning library. Currently, Mongoose only \
supports edge partitioning. \
 \
mongoose is part of the SuiteSparse sparse matrix suite."
LICENSE = "GPL-3.0-only"

PV = "2.0.4"

RPM_NAME = "libmongoose2-2.0.4-49.1.aarch64.rpm"
RPM_HASH = "d57e789ebb995a552ccde7d0857aaaa6eea560689619c52bcfdf5fde637fb35181812969e29629e420c4c5e56b87d956d4c50a8093658f24dedda713cfee6cb0"

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
