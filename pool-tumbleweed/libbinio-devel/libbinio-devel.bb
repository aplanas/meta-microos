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

RPM_NAME = "libbinio-devel-1.5-1.3.aarch64.rpm"
RPM_HASH = "e30847436d4eeb391f4e1935daf09d656f452d8a9fa55c94d5e1c9d404391da5a424b8f3b35fb13818b0627d437ba64f72b19cd5e89a621c172590a3ec1f1956"

RPROVIDES:${PN} += "libbinio-devel \
pkgconfig-libbinio"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbinio1"

inherit rpm
