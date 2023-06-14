SUMMARY = "Development files for the distributed SQLite"
DESCRIPTION = "dqlite is a C library implementing an embeddable and replicated \
SQL database engine with high-availability and automatic failover. \
 \
This package contains the files necessary for developing and building \
applications using the library."
LICENSE = "LGPL-3.0-only-WITH-LGPL-3.0-linking-exception"

PV = "1.14.0"

RPM_NAME = "dqlite-devel-1.14.0-2.3.aarch64.rpm"
RPM_HASH = "d5bc3b4b538c299c787327a88e00f6dfb47e881eef9981f27bb19017282bb61718e1f178498d17cfd639e173c67285a4ed89156cabc9f39bc3d8f63678c6681b"

RPROVIDES:${PN} += "dqlite-devel \
pkgconfig-dqlite"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdqlite0"

inherit rpm
