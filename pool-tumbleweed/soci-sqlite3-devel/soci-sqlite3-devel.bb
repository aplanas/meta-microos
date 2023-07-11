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

RPM_NAME = "soci-sqlite3-devel-4.0.2-4.5.aarch64.rpm"
RPM_HASH = "e227b46e8b8c9ba3b487c1ff0d45f1c7f3be454cbb444db9b13f02364e3b0ee794af528a7108b23317189da2d91f06019f517f4cb77ea57afeee2cbe004e67b6"

RPROVIDES:${PN} += "soci-sqlite3-devel"

RDEPENDS:${PN} += "libsoci-sqlite3-4-0 \
pkgconfig-sqlite3 \
soci-devel"

inherit rpm
