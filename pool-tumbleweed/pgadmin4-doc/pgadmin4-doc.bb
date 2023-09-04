SUMMARY = "Documentation for pgAdmin4"
DESCRIPTION = "pgAdmin 4 is a rewrite of the pgAdmin3 management tool for the \
PostgreSQL database. \
 \
This package contains the documentation for pgadmin4."
LICENSE = "PostgreSQL"

PV = "7.6"

RPM_NAME = "pgadmin4-doc-7.6-1.1.noarch.rpm"
RPM_HASH = "16822aa124de612f62fc0b77975d9a5df3b0abe3ec0c203a12295e30eca7beb758bb9d36a5b196a07a6e321da9873b233f5cf05424c2a124145303f2543306e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pgadmin4-doc"

RDEPENDS:${PN} += ""

inherit rpm
