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

RPM_NAME = "libgle3-3.1.0-152.28.aarch64.rpm"
RPM_HASH = "5228c3a8aa56d622dde5118fdb0987e1d955adf03d7be5f8bc82173b7c4ba8b7d35383cd036dc0a24d49ee54718d7b1d60b2078f8f22d8199f00240630151499"

RPROVIDES:${PN} += "libgle.so.3 \
libgle3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
