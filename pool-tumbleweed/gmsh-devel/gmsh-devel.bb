SUMMARY = "A three-dimensional finite element mesh generator"
DESCRIPTION = "Gmsh is a 3D finite element grid generator with a build-in CAD engine \
and post-processor. \
 \
This package contains the header files needed for development."
LICENSE = "GPL-2.0-or-later"

PV = "4.11.1"

RPM_NAME = "gmsh-devel-4.11.1-2.1.aarch64.rpm"
RPM_HASH = "0e40200e5602725c75915957554d3d0a8210f00a8ff4f5e1f6c982110ebf311e104e5358e20bcc62a99c54cc888158ca020e7ea7df9655a7552bb8c93de8703e"

RPROVIDES:${PN} += "gmsh-devel \
gmsh-devel(aarch-64)"
RDEPENDS:${PN} += "libgmsh4_11"

inherit rpm
