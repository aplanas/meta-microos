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

RPM_NAME = "gama-2.24-1.4.aarch64.rpm"
RPM_HASH = "b3e07375836c8581abd25fd099b0e30f7ffe1dac6228831881aa943bb2754fcb77debb5bd2ff768a0fb306312879590c35d43aa47066f59f4a827e369965c689"

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
