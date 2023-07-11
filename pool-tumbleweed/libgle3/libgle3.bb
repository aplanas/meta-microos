SUMMARY = "The GLE Tubing and Extrusion Library"
DESCRIPTION = "The GLE Tubing and Extrusion Library is a graphics application \
programming interface (API). The library consists of a number of C \
language subroutines for drawing tubing and extrusions. The library is \
distributed in source code form in a package that includes \
documentation, a VRML proposal, make files, and full source code and \
header files. It uses the OpenGL (TM) programming API to perform the \
actual drawing of the tubing and extrusions."
LICENSE = "GPL-2.0+"

PV = "3.1.0"

RPM_NAME = "libgle3-3.1.0-152.29.aarch64.rpm"
RPM_HASH = "7b498d53510ed8e03655230524822a232157a739bcf102978fa78ca3d8b7994a7a75c50c3fbe73c5431683b3405cefa81294acb13329dca9f1124675989956a8"

RPROVIDES:${PN} += "libgle.so.3 \
libgle3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
