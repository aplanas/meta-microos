SUMMARY = "Development files for spatialindex"
DESCRIPTION = "The spatialindex-devel package contains libraries and header files for \
developing applications that use spatialindex."
LICENSE = "MIT"

PV = "1.9.3"

RPM_NAME = "spatialindex-devel-1.9.3-2.10.aarch64.rpm"
RPM_HASH = "5577046c11d8ed673fd69d1f86e63c0d314d435e304a80d71056657e4148bf50e7ad40c6b742160e5f8af27e0b66d7adc8a87dfebd5b2cc0e83756f546a84eb7"

RPROVIDES:${PN} += "libspatialindex-devel \
pkgconfig-libspatialindex \
spatialindex-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspatialindex6"

inherit rpm
