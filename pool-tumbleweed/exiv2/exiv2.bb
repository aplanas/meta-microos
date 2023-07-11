SUMMARY = "Tool to access image Exif metadata"
DESCRIPTION = "Exiv2 is a command line utility to access image metadata from tags like \
Exif."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "0.28.0"

RPM_NAME = "exiv2-0.28.0-1.1.aarch64.rpm"
RPM_HASH = "d26c36b51ed98a71a05fa46ebc8462db3bddce2c86067bdf9ec7f34401b5cbf8c7985fa44450c45df51b84c3d8c55a1e1f09190f7a5cbb88b74766b06c931254"

RPROVIDES:${PN} += "exiv2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexiv2.so.28 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
