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

RPM_NAME = "geos-devel-3.11.2-2.2.aarch64.rpm"
RPM_HASH = "d1c902b6cbbdcc37e8d913687ba7a7581602dff8d9d81a81dbc85f13f9acf75bbe683d0a821e75adf2071d0305d4125d5891913dcd0fc62f1429db296d97c1d8"

RPROVIDES:${PN} += "cmake-geos \
geos-devel \
libgeos-devel \
pkgconfig-geos"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libgeos-c1 \
libgeos3-11-2"

inherit rpm
