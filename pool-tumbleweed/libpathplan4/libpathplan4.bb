SUMMARY = "Library for finding smooth shortest paths"
DESCRIPTION = "The pathplan library contains functions for finding shortest paths in polygons \
in fitting bezier curves to those paths."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "libpathplan4-2.49.3-6.4.aarch64.rpm"
RPM_HASH = "2a8a11acf1318f4ae4132ce4de182d90a1d03e63aec45b6607e826ff02c32a5e5e47d765a08932c76f41809dec1f311c7478f7d663ff959101d3077470ad443c"

RPROVIDES:${PN} += "libgraphviz6-/usr/lib64/libpathplan.so.4 \
libpathplan.so.4 \
libpathplan4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
