SUMMARY = "Development files for Reverse Search Vertex Enumeration"
DESCRIPTION = "lrslib is a library for the reverse search algorithm for vertex \
enumeration/convex hull problems and comes with a choice of three \
arithmetic packages. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of lrslib."
LICENSE = "GPL-2.0-or-later"

PV = "7.2"

RPM_NAME = "lrslib-devel-7.2-1.4.aarch64.rpm"
RPM_HASH = "38cadea2a7b48d6943860c50fc22cf8f5ed22c571340a116f2755cb32cdde775f6c4899844d516fc47db8cd4c55b11bc3f70f0e07a6504f08312dbbfbd461da2"

RPROVIDES:${PN} += "lrslib-devel"

RDEPENDS:${PN} += "liblrs1"

inherit rpm
