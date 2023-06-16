SUMMARY = "Example problems for CalculiX"
DESCRIPTION = "CalculiX is a package designed to solve field problems. \
The method used is the finite element method. ccx-examples \
contains examples problems, together with reference data \
to check your installation."
LICENSE = "BSD-3-Clause & GPL-2.0-only & SUSE-Public-Domain"

PV = "2.20"

RPM_NAME = "ccx-examples-2.20-1.3.noarch.rpm"
RPM_HASH = "9878b79017f0527844ee5693fb2a9c60832baa930cdb13d26feb09a5d5531ea433a071bc2bd50e367c10ca8c66c5d12bd87a9bfdde1a9194a091019a0d2810c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ccx-doc-/usr/share/ccx-examples-2.12/achtel2.inp \
ccx-examples"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh"

inherit rpm
