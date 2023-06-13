SUMMARY = "Geometry Engine library"
DESCRIPTION = "GEOS (Geometry Engine - Open Source) is a C++ port of the Java Topology \
Suite (JTS). As such, it aims to contain the complete functionality of JTS \
in C++. This includes all the OpenGIS 'Simple Features for SQL' spatial \
predicate functions and spatial operators, as well as specific JTS topology \
functions such as IsValid()."
LICENSE = "LGPL-2.1-only"

PV = "3.11.2"

RPM_NAME = "libgeos3_11_2-3.11.2-2.1.aarch64.rpm"
RPM_HASH = "24e35ad8777aa1b2c2fdf147292f64db3db25c2c5fe7b57b130803fdbc1adbd23c7a8e812a076fb594a7f5c767c153ccfe61b487202ba49f960e7e5f72d90eaa"

RPROVIDES:${PN} += "libgeos.so.3.11.2()(64bit) \
libgeos3_11_2 \
libgeos3_11_2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
