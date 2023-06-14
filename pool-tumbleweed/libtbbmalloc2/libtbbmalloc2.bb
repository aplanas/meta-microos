SUMMARY = "Threading Building Blocks (TBB)"
DESCRIPTION = "This subpackage contains the two TBB memory allocator templates that \
are similar to the STL template class std::allocator. These two \
templates, scalable_allocator<T> and cache_aligned_allocator<T>, \
address critical issues in parallel programming: scalability and \
false sharing."
LICENSE = "Apache-2.0"

PV = "2021.8.0"

RPM_NAME = "libtbbmalloc2-2021.8.0-1.5.aarch64.rpm"
RPM_HASH = "abadbf65e5737fff4a89bb867a6ca43d545a126a8af4765c7cc52e97a003f46ff5147c33b23184cca08145a74e41ee6c7d3d1518ef56645ca6805062b9d3a499"

RPROVIDES:${PN} += "libtbbmalloc-proxy.so.2 \
libtbbmalloc.so.2 \
libtbbmalloc2 \
tbb"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
