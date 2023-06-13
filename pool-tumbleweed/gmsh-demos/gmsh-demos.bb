SUMMARY = "A three-dimensional finite element mesh generator"
DESCRIPTION = "Gmsh is a 3D finite element grid generator with a build-in CAD engine \
and post-processor. \
 \
This package contains demos and tutorials."
LICENSE = "GPL-2.0-or-later"

PV = "4.11.1"

RPM_NAME = "gmsh-demos-4.11.1-2.1.noarch.rpm"
RPM_HASH = "e2662acb7056e7695c2b9390b65d11829153808b30980c141261511c628378382553c5e608dab192723315026d436818479f785399dc23f18ed9ae28692b61cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gmsh-demos"

RDEPENDS:${PN} += ""

inherit rpm
