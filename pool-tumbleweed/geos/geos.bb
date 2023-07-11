SUMMARY = "Geometry Engine - Open Source"
DESCRIPTION = "GEOS (Geometry Engine - Open Source) is a C++ port of the Java Topology \
Suite (JTS). As such, it aims to contain the complete functionality of JTS \
in C++. This includes all the OpenGIS 'Simple Features for SQL' spatial \
predicate functions and spatial operators, as well as specific JTS topology \
functions such as IsValid()."
LICENSE = "LGPL-2.1-only"

PV = "3.11.2"

RPM_NAME = "geos-3.11.2-2.2.aarch64.rpm"
RPM_HASH = "4374be73898dbac8aecc929f65b7d1edfd65a6b9e9ade8c0f43b869d2a0608f87042afe3f83a4fdd527020c72c5081fed725e60094a4641ba1d26f354857ed33"

RPROVIDES:${PN} += "geos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgeos.so.3.11.2 \
libstdc++.so.6"

inherit rpm
