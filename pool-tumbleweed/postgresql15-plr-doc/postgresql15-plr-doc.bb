SUMMARY = "Documentation for PL/R - R Procedural Language for PostgreSQL"
DESCRIPTION = "PL/R is a loadable procedural language that enables you to write PostgreSQL \
functions and triggers in the R programming language. PL/R offers most (if \
not all) of the capabilities a function writer has in the R language. \
 \
This package contain the associated documentation"
LICENSE = "GPL-2.0-or-later"

PV = "8.4.5"

RPM_NAME = "postgresql15-plr-doc-8.4.5-1.1.aarch64.rpm"
RPM_HASH = "a6794c5980648b6746a07697e1551f6434fa79e94b62f174a56ab072a9c38cfc98cd4e06f4eeb560f1536a1c814d160a0f7313279ca8faf1ea17a8db46bfa9a5"

RPROVIDES:${PN} += "postgresql15-plr-doc"

RDEPENDS:${PN} += ""

inherit rpm
