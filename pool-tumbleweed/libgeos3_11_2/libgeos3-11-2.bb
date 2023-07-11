SUMMARY = "Geometry Engine library"
DESCRIPTION = "GEOS (Geometry Engine - Open Source) is a C++ port of the Java Topology \
Suite (JTS). As such, it aims to contain the complete functionality of JTS \
in C++. This includes all the OpenGIS 'Simple Features for SQL' spatial \
predicate functions and spatial operators, as well as specific JTS topology \
functions such as IsValid()."
LICENSE = "LGPL-2.1-only"

PV = "3.11.2"

RPM_NAME = "libgeos3_11_2-3.11.2-2.2.aarch64.rpm"
RPM_HASH = "d73c5135f4d1706bb2a269af63ad638a1f8fa58188f430609466df9e2c4acca4f1523e4b59923e031c28358069a4cfc6a370701a0bd4a80b02870bdbf2de51aa"

RPROVIDES:${PN} += "libgeos.so.3.11.2 \
libgeos3-11-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
