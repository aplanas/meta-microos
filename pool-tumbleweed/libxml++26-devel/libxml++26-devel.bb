SUMMARY = "C++ Interface for XML Files -- Development Files"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "2.42.2"

RPM_NAME = "libxml++26-devel-2.42.2-2.4.aarch64.rpm"
RPM_HASH = "8a6906e0638f475bbe3a37b543f98b5cff362540add2fcf0119a73c6ecca2114b83b176afad2ad34a516f32c233c4afcd3f34e2899ae14281528a018425982c5"

RPROVIDES:${PN} += "libxml++26-devel \
pkgconfig-libxml++-2.6"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxml++-2-6-2 \
pkgconfig-glibmm-2.4 \
pkgconfig-libxml-2.0"

inherit rpm
