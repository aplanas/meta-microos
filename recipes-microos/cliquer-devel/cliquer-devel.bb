SUMMARY = "Development files for Cliquer"
DESCRIPTION = "Cliquer is a set of C routines for finding cliques in an arbitrary \
weighted graph and uses an exact branch-and-bound algorithm. \
 \
This subpackage provides the development headers for Cliquer's library."
LICENSE = "GPL-2.0-or-later"

PV = "1.22"

RPM_NAME = "cliquer-devel-1.22-2.7.aarch64.rpm"
RPM_HASH = "f102226aa739d436fad4555ef7023d075eaeff3c7e2353c872d6dc8be69f67daea04134b4f9fa45b429ac0630240fd80448865aaad9f9e52cd5e2f4c2de8f45c"

RPROVIDES:${PN} += "cliquer-devel cliquer-devel(aarch-64)"
RDEPENDS:${PN} += "libcliquer1"

inherit rpm
