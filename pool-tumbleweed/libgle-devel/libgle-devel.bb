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

RPM_NAME = "libgle-devel-3.1.0-152.28.aarch64.rpm"
RPM_HASH = "04da692327559c9d3d654850812a4e8f2ad7f2ef621e37e814f1a1357018921cf32354f57295286be586bd122875073e55fbc9b8f96301007c1ac9b37dff7efd"

RPROVIDES:${PN} += "libgle-devel"

RDEPENDS:${PN} += "libgle3"

inherit rpm
