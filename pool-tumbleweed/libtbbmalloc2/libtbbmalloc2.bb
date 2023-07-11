SUMMARY = "Threading Building Blocks (TBB)"
DESCRIPTION = "This subpackage contains the two TBB memory allocator templates that \
are similar to the STL template class std::allocator. These two \
templates, scalable_allocator<T> and cache_aligned_allocator<T>, \
address critical issues in parallel programming: scalability and \
false sharing."
LICENSE = "Apache-2.0"

PV = "2021.9.0"

RPM_NAME = "libtbbmalloc2-2021.9.0-1.1.aarch64.rpm"
RPM_HASH = "e1d87c0eeb16cea462bb14b13fecded07ec4b2f5395cc8e9e5d478caba57ed96dcc5bda662797d2813e8a581d3922a5cedf871a2b322c485ea291f738aaedca1"

RPROVIDES:${PN} += "libtbbmalloc-proxy.so.2 \
libtbbmalloc.so.2 \
libtbbmalloc2 \
tbb"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
