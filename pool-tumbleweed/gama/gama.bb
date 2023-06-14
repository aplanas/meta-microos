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

PV = "2.24"

RPM_NAME = "gama-2.24-1.3.aarch64.rpm"
RPM_HASH = "cc669f705ef8dbb180fb8d4570d9b706b74b4ffdd118c2d474f45e4f3d1d438dde6b1af2b9a0052a187c73b650ff674a2da84e8d9ae269704513ab5e6c671a95"

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
