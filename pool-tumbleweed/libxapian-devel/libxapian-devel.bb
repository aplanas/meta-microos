SUMMARY = "Files needed for building packages which use Xapian"
DESCRIPTION = "Xapian is a Probabilistic Information Retrieval library. It offers an \
adaptable toolkit for adding indexing and search facilities to \
applications. \
 \
This subpackage contains the header files for the library."
LICENSE = "GPL-2.0-only"

PV = "1.4.21"

RPM_NAME = "libxapian-devel-1.4.21-1.4.aarch64.rpm"
RPM_HASH = "c6dc7e12a7e31ddd380c28fbec75bef2af2476eea8b7be2c324369e1555ee2f5817fa546776dd68ec135e71ccd1e71c387d035b43461a05e1757297f8a5e027c"

RPROVIDES:${PN} += "libxapian-devel \
pkgconfig-xapian-core"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
gcc-c++ \
libuuid-devel \
libxapian30 \
zlib-devel"

inherit rpm
