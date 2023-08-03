SUMMARY = "tool to generate man pages from Doxygen XML files"
DESCRIPTION = "The doxygen2man package contains the doxygen2man utility."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.8+20230721.002171b"

RPM_NAME = "doxygen2man-2.0.8+20230721.002171b-1.1.aarch64.rpm"
RPM_HASH = "cc2d8773958010e74610e2093d5f15416fb66821d1b09a93f41793d56edfa5510b87951d020282795d3a8361928a1bf4f0d2676a300533870c9c816890981623"

RPROVIDES:${PN} += "doxygen2man"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libqb.so.100 \
libqb100 \
libxml2.so.2"

inherit rpm
