SUMMARY = "Python API for the gmsh mesh generator"
DESCRIPTION = "Gmsh is a 3D finite element grid generator with a build-in CAD engine \
and post-processor. \
 \
This package contains the public gmsh API for Python."
LICENSE = "GPL-2.0-or-later"

PV = "4.11.1"

RPM_NAME = "python3-gmsh-4.11.1-2.2.noarch.rpm"
RPM_HASH = "f72ba6370876be67b6547035937eba427c24b20580305aa7b9f20e2a5fc2be3f92488056f4221aa89e25ad8b57f9907e782a1e8c9a2ffc92c4aea31cd98fbe81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gmsh \
python3.11dist-gmsh \
python3dist-gmsh"

RDEPENDS:${PN} += "libgmsh4-11 \
python-abi"

inherit rpm
