SUMMARY = "C++ Interface for XML Files -- Development Files"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "2.42.2"

RPM_NAME = "libxml++26-devel-2.42.2-2.3.aarch64.rpm"
RPM_HASH = "4b656eaf8b68c0194b593898084e419b6139475be4bdde88ce3247244a474317cc9f74d6e04462cae0f820ccaa951dbf9617b14d89ce6408163b926fc94f588f"

RPROVIDES:${PN} += "libxml++26-devel \
libxml++26-devel(aarch-64) \
pkgconfig(libxml++-2.6)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxml++-2_6-2 \
pkgconfig(glibmm-2.4) \
pkgconfig(libxml-2.0)"

inherit rpm
