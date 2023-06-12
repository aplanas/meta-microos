SUMMARY = "Documentation for pgAdmin4"
DESCRIPTION = "pgAdmin 4 is a rewrite of the pgAdmin3 management tool for the \
PostgreSQL database. \
 \
This package contains the documentation for pgadmin4."
LICENSE = "PostgreSQL"

PV = "4.30"

RPM_NAME = "pgadmin4-doc-4.30-2.10.noarch.rpm"
RPM_HASH = "c298c2c9f1680ce90e605bffaee4f48005ef1808b2f97d3b1e0e5bf93ad5f278ea71653bd17bef5aef07f0d5978d38f374f6c8c4c819c661e927a704a5eba44b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pgadmin4-doc"
RDEPENDS:${PN} += ""

inherit rpm
