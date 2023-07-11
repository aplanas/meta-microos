SUMMARY = "Files for Developing with lpsolve"
DESCRIPTION = "Includes and definitions for developing with the lpsolve library."
LICENSE = "LGPL-2.0+"

PV = "5.5.2.0"

RPM_NAME = "lpsolve-devel-5.5.2.0-10.29.aarch64.rpm"
RPM_HASH = "76116f5e4b0a5103190d6643c765d8d3014cecfcf6b7025a858cb177dff67c7ff8a87cf24dd8e8b3ce21bcbbfa4202a74b31290226172d904e2be8682a239b8d"

RPROVIDES:${PN} += "lpsolve-devel"

RDEPENDS:${PN} += "liblpsolve55-0"

inherit rpm
