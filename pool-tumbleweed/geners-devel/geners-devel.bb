SUMMARY = "Sources and header files for Geners"
DESCRIPTION = "The 'geners' package is designed to address the problem of C++ object persistence in situations where the most typical data access pattern is 'write once read many' (WORM). This access pattern is very common in scientific projects — a data recording device or a simulation program creates the original set of objects which is later reused (typically, for the purposes of data analysis and presentation of results) by other programs. 'Geners' is, more or less, a set of tools and conventions which allows its users to develop C++ classes that can be converted to and from a storable stream of bytes in a well-organized and type-safe manner. Serialization of STL containers is supported, including the ones added in the C++11 standard. Independent versioning of each class definition is allowed. \
 \
This package provides the sources and header files required for developing apps using geners."
LICENSE = "X11"

PV = "1.12.0"

RPM_NAME = "geners-devel-1.12.0-1.15.aarch64.rpm"
RPM_HASH = "f4193682360ae87033be81004d62ce36dce667ae303f24ccdf7eef7f4eaf9d921d923e1491f0bb47652442a7ea9b6e9c46e2de6711f5f9f59176a686fd3eb735"

RPROVIDES:${PN} += "geners-devel \
pkgconfig-geners"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgeners0"

inherit rpm
