SUMMARY = "Shared libraries for Geners"
DESCRIPTION = "The 'geners' package is designed to address the problem of C++ object persistence in situations where the most typical data access pattern is 'write once read many' (WORM). This access pattern is very common in scientific projects — a data recording device or a simulation program creates the original set of objects which is later reused (typically, for the purposes of data analysis and presentation of results) by other programs. 'Geners' is, more or less, a set of tools and conventions which allows its users to develop C++ classes that can be converted to and from a storable stream of bytes in a well-organized and type-safe manner. Serialization of STL containers is supported, including the ones added in the C++11 standard. Independent versioning of each class definition is allowed. \
 \
This package provides the shared libraries for Geners."
LICENSE = "X11"

PV = "1.12.0"

RPM_NAME = "libgeners0-1.12.0-1.15.aarch64.rpm"
RPM_HASH = "65ca1d2c66b5a5c540ec8fa4e5a6a55285c530e27eb0a838d4d6aed75127310ae73def8af323edaee0d4b11ab390193ef94e559ba629ad388e673b3432ea1496"

RPROVIDES:${PN} += "libgeners.so.0 \
libgeners0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
