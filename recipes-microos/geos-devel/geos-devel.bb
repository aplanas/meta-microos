SUMMARY = "Development files for GEOS"
DESCRIPTION = "GEOS (Geometry Engine - Open Source) is a C++ port of the Java Topology \
Suite (JTS). As such, it aims to contain the complete functionality of \
JTS in C++. This includes all the OpenGIS 'Simple Features for SQL' spatial \
predicate functions and spatial operators, as well as specific JTS topology \
functions such as IsValid() \
 \
This package contains the development files to build applications that \
use GEOS."
LICENSE = "LGPL-2.1-only"

PV = "3.11.2"

RPM_NAME = "geos-devel-3.11.2-2.1.aarch64.rpm"
RPM_HASH = "07fc96ebf5698863aa7d12aa6e9ea85fc19b8632b807f60e676714390ac6dc966bafcac65fe93672d169fa15066e6d0f812d158fa4a843881f53a2e83cb53e10"

RPROVIDES:${PN} += "cmake(geos) geos-devel geos-devel(aarch-64) libgeos-devel pkgconfig(geos)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config libgeos3_11_2 libgeos_c1"

inherit rpm
