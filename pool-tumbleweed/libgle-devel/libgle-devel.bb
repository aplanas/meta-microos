SUMMARY = "Development files for the GLE tubing and extrusion library"
DESCRIPTION = "The GLE Tubing and Extrusion Library is a graphics application \
programming interface (API). The library consists of a number of C \
language subroutines for drawing tubing and extrusions. The library is \
distributed in source code form in a package that includes \
documentation, a VRML proposal, make files, and full source code and \
header files. It uses the OpenGL (TM) programming API to perform the \
actual drawing of the tubing and extrusions."
LICENSE = "GPL-2.0+"

PV = "3.1.0"

RPM_NAME = "libgle-devel-3.1.0-152.29.aarch64.rpm"
RPM_HASH = "10f6168f4ee501aa8206dfee60a764de7a0872c0cda2b8596ed7b0420fd9f587d8422f839fa15039cb32a1688b5f8b691b731835ab6dad40ff94718c135f51b1"

RPROVIDES:${PN} += "libgle-devel"

RDEPENDS:${PN} += "libgle3"

inherit rpm
