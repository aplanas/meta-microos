SUMMARY = "Tcl binding for SQLite"
DESCRIPTION = "This package contains laguage bindings from the Tcl programming \
language SQLite. \
 \
SQLite is a C library that implements an embeddable SQL database \
engine. Programs that link with the SQLite library can have SQL \
database access without running a separate RDBMS process."
LICENSE = "SUSE-Public-Domain"

PV = "3.42.0"

RPM_NAME = "sqlite3-tcl-3.42.0-1.1.aarch64.rpm"
RPM_HASH = "8f07d3c83bce3505b960eddca0ef9e16319b633f6178e7c864a5d6a31f04b7b4fd14485e9f63086b96f0a19371bf27142889f055fcff709b88bf8400961eb215"

RPROVIDES:${PN} += "libtclsqlite3.so \
sqlite3-tcl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0"

inherit rpm
