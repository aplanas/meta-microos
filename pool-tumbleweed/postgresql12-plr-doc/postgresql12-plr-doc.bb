SUMMARY = "Documentation for PL/R - R Procedural Language for PostgreSQL"
DESCRIPTION = "PL/R is a loadable procedural language that enables you to write PostgreSQL \
functions and triggers in the R programming language. PL/R offers most (if \
not all) of the capabilities a function writer has in the R language. \
 \
This package contain the associated documentation"
LICENSE = "GPL-2.0-or-later"

PV = "8.4.5"

RPM_NAME = "postgresql12-plr-doc-8.4.5-1.1.aarch64.rpm"
RPM_HASH = "8aeaa1e2db6682e170ac7b84992a5a3ba424c7680ba8c1d88c13b5b5f3ef40b93a716c1d60dac882530a97755aeb59be6facc55737c58cb423a9cc9f4296a982"

RPROVIDES:${PN} += "postgresql12-plr-doc \
postgresql12-plr-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
