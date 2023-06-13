SUMMARY = "Graph partitioning library"
DESCRIPTION = "Mongoose is a graph partitioning library. Currently, Mongoose only \
supports edge partitioning. \
 \
mongoose is part of the SuiteSparse sparse matrix suite."
LICENSE = "GPL-3.0-only"

PV = "2.0.4"

RPM_NAME = "libmongoose2-2.0.4-49.1.aarch64.rpm"
RPM_HASH = "d57e789ebb995a552ccde7d0857aaaa6eea560689619c52bcfdf5fde637fb35181812969e29629e420c4c5e56b87d956d4c50a8093658f24dedda713cfee6cb0"

RPROVIDES:${PN} += "libldl-2_0_4 \
libmongoose.so.2()(64bit) \
libmongoose2 \
libmongoose2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libsuitesparseconfig.so.5()(64bit)"

inherit rpm
