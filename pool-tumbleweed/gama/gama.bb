SUMMARY = "Adjustment of geodetic networks"
DESCRIPTION = "GNU Gama is a project dedicated to adjustment of geodetic \
networks. It is intended for use with traditional geodetic \
surveyings which are still used and needed in special measurements \
(e.g., underground or high precision engineering measurements) \
where the Global Positioning System (GPS) cannot be used. \
 \
Adjustment in local Cartesian coordinate systems is fully \
supported by a command-line program gama-local that adjusts \
geodetic (free) networks of observed distances, directions, \
angles, height differences, 3D vectors and observed coordinates \
(coordinates with given variance-covariance matrix). Adjustment in \
global coordinate systems is supported only partly as a gama-g3 \
program."
LICENSE = "GPL-3.0-or-later"

PV = "2.25"

RPM_NAME = "gama-2.25-1.1.aarch64.rpm"
RPM_HASH = "3fa491433f314cae1f826255ffae2c419c602331e42dd38e9c210be6353cf21c04abb19014571855ff25fdc78a0633f349d3dbe5354cd8c37d8963b344decab1"

RPROVIDES:${PN} += "gama"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libsqlite3.so.0 \
libstdc++.so.6 \
libxml2-tools"

inherit rpm
