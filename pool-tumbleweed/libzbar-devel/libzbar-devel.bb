SUMMARY = "Development environment for the ZBar library"
DESCRIPTION = "This package contains all necessary include files, libraries, \
configuration files and development tools needed to compile and link \
applications using the zbar library."
LICENSE = "LGPL-2.0-or-later"

PV = "0.23.90"

RPM_NAME = "libzbar-devel-0.23.90-4.1.aarch64.rpm"
RPM_HASH = "25c0348690d98e08540262674675102db10fa28a5c154c9d3d4f03c682f0eac7228ac5e5be514ec26aa0f999211f965a9c9d80e403fdb4b30061945c5d34478e"

RPROVIDES:${PN} += "libzbar-devel \
pkgconfig-zbar"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzbar0"

inherit rpm
