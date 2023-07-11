SUMMARY = "A three-dimensional finite element mesh generator"
DESCRIPTION = "Gmsh is a 3D finite element grid generator with a build-in CAD engine \
and post-processor. \
 \
This package contains demos and tutorials."
LICENSE = "GPL-2.0-or-later"

PV = "4.11.1"

RPM_NAME = "gmsh-demos-4.11.1-2.2.noarch.rpm"
RPM_HASH = "02e81f53ed4579a5f5e41054145e430594b0ac7e26b47ada55b49d0c3f8a0f6d558b2fde46f43fec29cb7be3c795a844c45a837bdabdc2b55240beaadcbc1c14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gmsh-demos"

RDEPENDS:${PN} += ""

inherit rpm
