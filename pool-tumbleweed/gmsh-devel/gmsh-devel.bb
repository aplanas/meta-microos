SUMMARY = "A three-dimensional finite element mesh generator"
DESCRIPTION = "Gmsh is a 3D finite element grid generator with a build-in CAD engine \
and post-processor. \
 \
This package contains the header files needed for development."
LICENSE = "GPL-2.0-or-later"

PV = "4.11.1"

RPM_NAME = "gmsh-devel-4.11.1-2.2.aarch64.rpm"
RPM_HASH = "d60a84d78d8f005d9d5dd0731890e8eca1ba33e655e91b9e410644d532b622dcfcc88cf726cd9be04021eb7cb4f984f9a004a0729eb16aae38148f36e9894a4d"

RPROVIDES:${PN} += "gmsh-devel"

RDEPENDS:${PN} += "libgmsh4-11"

inherit rpm
