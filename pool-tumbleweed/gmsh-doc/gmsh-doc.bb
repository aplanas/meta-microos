SUMMARY = "A three-dimensional finite element mesh generator"
DESCRIPTION = "Gmsh is a 3D finite element grid generator with a build-in CAD engine \
and post-processor. \
 \
This package contains the documentation for gmsh."
LICENSE = "GPL-2.0-or-later"

PV = "4.11.1"

RPM_NAME = "gmsh-doc-4.11.1-2.2.noarch.rpm"
RPM_HASH = "c1a8a6ca83fd65b76e8842ccbfaaf5480c810a6d136941d1e2f9794878331090a93f29cc13b29ece1237a938cecd7f29193ddd2f133bd8858ee9d4abf3d82dad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gmsh-doc"

RDEPENDS:${PN} += ""

inherit rpm
