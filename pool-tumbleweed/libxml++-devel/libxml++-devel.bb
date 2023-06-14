SUMMARY = "C++ Interface for XML Files -- Development Files"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.3"

RPM_NAME = "libxml++-devel-5.0.3-1.2.aarch64.rpm"
RPM_HASH = "f1a3516a9c6257c300ec08029f87292b7e4ce4dae336b43f17c0e702dcf470ae41318d879c2e3488618b1f39d3d046906b134a4c07109f6e1885a53e6beaa68e"

RPROVIDES:${PN} += "libxml++-devel \
pkgconfig-libxml++-5.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxml++-5-0-1 \
pkgconfig-libxml-2.0"

inherit rpm
