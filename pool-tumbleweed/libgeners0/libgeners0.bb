SUMMARY = "Shared libraries for Geners"
DESCRIPTION = "The 'geners' package is designed to address the problem of C++ object persistence in situations where the most typical data access pattern is 'write once read many' (WORM). This access pattern is very common in scientific projects — a data recording device or a simulation program creates the original set of objects which is later reused (typically, for the purposes of data analysis and presentation of results) by other programs. 'Geners' is, more or less, a set of tools and conventions which allows its users to develop C++ classes that can be converted to and from a storable stream of bytes in a well-organized and type-safe manner. Serialization of STL containers is supported, including the ones added in the C++11 standard. Independent versioning of each class definition is allowed. \
 \
This package provides the shared libraries for Geners."
LICENSE = "X11"

PV = "1.12.0"

RPM_NAME = "libgeners0-1.12.0-1.14.aarch64.rpm"
RPM_HASH = "18ef6d83b181b4556f3ee6733b29c024e47329ca9c5bfc442dea36ed13a9120db7aa1b90622e658400b1134d0ae326739c89a754d63e88a634bcc33d815b8af4"

RPROVIDES:${PN} += "libgeners.so.0()(64bit) \
libgeners0 \
libgeners0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
