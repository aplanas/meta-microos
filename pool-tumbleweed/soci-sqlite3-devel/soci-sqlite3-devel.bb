SUMMARY = "Development files for the soci SQLite back-end"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard. \
 \
The soci development package includes the header files, libraries, \
development tools necessary for compiling and linking applications \
which will use soci with SQLite."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "soci-sqlite3-devel-4.0.2-4.4.aarch64.rpm"
RPM_HASH = "5f7247fac6aef026c65173759c4aa3886de346d3b9a85565632d5b561fd1aac44315898c06faea4cb94dbc773d413b14d5382f285583da947afcd4ac9df16357"

RPROVIDES:${PN} += "soci-sqlite3-devel \
soci-sqlite3-devel(aarch-64)"

RDEPENDS:${PN} += "libsoci_sqlite3-4_0 \
pkgconfig(sqlite3) \
soci-devel"

inherit rpm
