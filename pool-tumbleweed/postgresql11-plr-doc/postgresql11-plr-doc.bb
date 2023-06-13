SUMMARY = "Documentation for PL/R - R Procedural Language for PostgreSQL"
DESCRIPTION = "PL/R is a loadable procedural language that enables you to write PostgreSQL \
functions and triggers in the R programming language. PL/R offers most (if \
not all) of the capabilities a function writer has in the R language. \
 \
This package contain the associated documentation"
LICENSE = "GPL-2.0-or-later"

PV = "8.4.5"

RPM_NAME = "postgresql11-plr-doc-8.4.5-1.1.aarch64.rpm"
RPM_HASH = "aadb02f1de0a60aa8a35b18df82f0772020d2d9c1b6fcae3f19f212bf4d63a8fc8de8b00f7a62fb77d729cfd352931919a1f1103a3d9e08ab27e8fd81d41b455"

RPROVIDES:${PN} += "postgresql11-plr-doc \
postgresql11-plr-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
