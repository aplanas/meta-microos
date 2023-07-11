SUMMARY = "Development files for the soci PostgreSQL back-end"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard. \
 \
The soci development package includes the header files, libraries, \
development tools necessary for compiling and linking applications \
which will use soci with PostgreSQL."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "soci-postgresql-devel-4.0.2-4.5.aarch64.rpm"
RPM_HASH = "bd626abae0d48aacd2661b8d6ce03297898ca20226c36b79c5feec6e63aeb27f4a2ab561e2f5024e597ef56d606b81b90410817183d5ebd15d18946a11995b0e"

RPROVIDES:${PN} += "soci-postgresql-devel"

RDEPENDS:${PN} += "libsoci-postgresql4-0 \
pkgconfig-libpq \
soci-devel"

inherit rpm
