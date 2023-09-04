SUMMARY = "Threading Building Blocks (TBB)"
DESCRIPTION = "This subpackage contains the two TBB memory allocator templates that \
are similar to the STL template class std::allocator. These two \
templates, scalable_allocator<T> and cache_aligned_allocator<T>, \
address critical issues in parallel programming: scalability and \
false sharing."
LICENSE = "Apache-2.0"

PV = "2021.10.0"

RPM_NAME = "libtbbmalloc2-2021.10.0-1.1.aarch64.rpm"
RPM_HASH = "1c2d64ecc51c42ddf1ce8c8926c4e91434d09be1e062b7a4f7b5dc10c34086e34e3f65c4b1b2ffd06629be7cbf71eb03a7dd9b7155dcefd4f98ef7ecd9f51098"

RPROVIDES:${PN} += "libtbbmalloc-proxy.so.2 \
libtbbmalloc.so.2 \
libtbbmalloc2 \
tbb"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
