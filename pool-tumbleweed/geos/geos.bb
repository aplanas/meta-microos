SUMMARY = "Geometry Engine - Open Source"
DESCRIPTION = "GEOS (Geometry Engine - Open Source) is a C++ port of the Java Topology \
Suite (JTS). As such, it aims to contain the complete functionality of JTS \
in C++. This includes all the OpenGIS 'Simple Features for SQL' spatial \
predicate functions and spatial operators, as well as specific JTS topology \
functions such as IsValid()."
LICENSE = "LGPL-2.1-only"

PV = "3.11.2"

RPM_NAME = "geos-3.11.2-2.1.aarch64.rpm"
RPM_HASH = "ddfc69532371fd2dd01d5aca45ddcec8fef3dcab630cea5d9b94bf9b242460e8933b2c6f0e15962dd20f4562e4257435dca688d78270294ebe5d617e96edad9b"

RPROVIDES:${PN} += "geos \
geos(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgeos.so.3.11.2()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
