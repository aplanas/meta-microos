SUMMARY = "Development files for libfole"
DESCRIPTION = "libfole is a library for Object Linking and Embedding (OLE) data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfole."
LICENSE = "LGPL-3.0-or-later"

PV = "20220115"

RPM_NAME = "libfole-devel-20220115-3.3.aarch64.rpm"
RPM_HASH = "cc6ad3bbbaaffeda58285767207cf96c675e0f2fadbf269eafb9f46a4f727a26e0e935f4e0522aa10dab0da06c314013ca14d001ede35e7309beefc5a9a5d773"

RPROVIDES:${PN} += "libfole-devel \
pkgconfig-libfole"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfole1"

inherit rpm
