SUMMARY = "Development files for the distributed SQLite"
DESCRIPTION = "dqlite is a C library implementing an embeddable and replicated \
SQL database engine with high-availability and automatic failover. \
 \
This package contains the files necessary for developing and building \
applications using the library."
LICENSE = "LGPL-3.0-only-with-LGPL-3.0-linking-exception"

PV = "1.15.1"

RPM_NAME = "dqlite-devel-1.15.1-1.1.aarch64.rpm"
RPM_HASH = "64322b82c914022dca4cd78eb9ba9a2b3db9ced8015ec56b007faa11ffa0545bca1db7ca2f883f7f0519e9e82d6ce83486cb5f973c9480f8524642f7204aaf86"

RPROVIDES:${PN} += "dqlite-devel \
pkgconfig-dqlite"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdqlite0"

inherit rpm
