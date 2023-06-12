SUMMARY = "Documentation for PL/R - R Procedural Language for PostgreSQL"
DESCRIPTION = "PL/R is a loadable procedural language that enables you to write PostgreSQL \
functions and triggers in the R programming language. PL/R offers most (if \
not all) of the capabilities a function writer has in the R language. \
 \
This package contain the associated documentation"
LICENSE = "GPL-2.0-or-later"

PV = "8.4.5"

RPM_NAME = "postgresql14-plr-doc-8.4.5-1.1.aarch64.rpm"
RPM_HASH = "f64e784d782251cf4bfc055001705e4d330dec3982dd563d9871e0f05a9c1bdb40ff45be10620b749b815c9ae345f8ae8d95747e4087f2ac5324721d67455021"

RPROVIDES:${PN} += "postgresql14-plr-doc \
postgresql14-plr-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
