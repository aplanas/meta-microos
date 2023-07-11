SUMMARY = "Example problems for CalculiX"
DESCRIPTION = "CalculiX is a package designed to solve field problems. \
The method used is the finite element method. ccx-examples \
contains examples problems, together with reference data \
to check your installation."
LICENSE = "BSD-3-Clause & GPL-2.0-only & SUSE-Public-Domain"

PV = "2.20"

RPM_NAME = "ccx-examples-2.20-1.4.noarch.rpm"
RPM_HASH = "e2d4a7fdc8678028f88d0ea51174a968ed9c74bc14ebd33d6cbc3f8bf893593cea47ec88dc3faea1d16f2407752c34ffa244a28f5e75b1cda7b5737defb05f70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ccx-doc-/usr/share/ccx-examples-2.12/achtel2.inp \
ccx-examples"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh"

inherit rpm
