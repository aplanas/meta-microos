SUMMARY = "A three-dimensional finite element mesh generator"
DESCRIPTION = "Gmsh is a 3D finite element grid generator with a build-in CAD engine \
and post-processor. \
 \
This package contains the documentation for gmsh."
LICENSE = "GPL-2.0-or-later"

PV = "4.11.1"

RPM_NAME = "gmsh-doc-4.11.1-2.1.noarch.rpm"
RPM_HASH = "0a7adfb13902c3c9d8e9fd2bfdaac3dce751098d6de2bb1f87893190e84cbbf58fea907d63ddaa53317b11d6c84fdf6cbf47000ec521c10b1090edfcfb34dd8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gmsh-doc"

RDEPENDS:${PN} += ""

inherit rpm
