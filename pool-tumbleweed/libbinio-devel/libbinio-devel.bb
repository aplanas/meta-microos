SUMMARY = "Development files for libbinio"
DESCRIPTION = "The binary I/O stream class library presents a platform-independent way to \
access binary data streams in C++. It transparently converts between \
machine-internal binary data representation and can be used on arbitrary \
binary data sources. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libbinio."
LICENSE = "LGPL-2.1-only"

PV = "1.5"

RPM_NAME = "libbinio-devel-1.5-1.2.aarch64.rpm"
RPM_HASH = "d971cffc7a350db48f4782c50cb1903a8b42d7f0f97f23b05a2804a63f725ae4c9b4b3069ec3d2067ec11971daf3cf3626e866bea44822c1990123830b29e0c9"

RPROVIDES:${PN} += "libbinio-devel \
pkgconfig-libbinio"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbinio1"

inherit rpm
