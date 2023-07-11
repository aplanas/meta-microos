SUMMARY = "Tcl binding for SQLite"
DESCRIPTION = "This package contains laguage bindings from the Tcl programming \
language SQLite. \
 \
SQLite is a C library that implements an embeddable SQL database \
engine. Programs that link with the SQLite library can have SQL \
database access without running a separate RDBMS process."
LICENSE = "SUSE-Public-Domain"

PV = "3.42.0"

RPM_NAME = "sqlite3-tcl-3.42.0-1.2.aarch64.rpm"
RPM_HASH = "b8976f25eb50429568bee5dbc120aac3d5c878c834ebb132ff4d00ee797f4eedf0023bc8b798a4369ea5af71b0fd7b412a0ea3335b74c0f0c21cbecd84c965d2"

RPROVIDES:${PN} += "libtclsqlite3.so \
sqlite3-tcl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0"

inherit rpm
