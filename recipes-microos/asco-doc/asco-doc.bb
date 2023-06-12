SUMMARY = "Documentation for ASCO"
DESCRIPTION = "ASCO brings circuit optimization capabilities to existing SPICE \
simulators using a parallel differential evolution (DE) optimization \
algorithm. Currently, out-of-the-box support for Eldo, HSPICE, LTspice, \
Spectre, Qucs and ngspice exist. \
 \
This package provides documentation for ASCO in PDF format."
LICENSE = "GPL-2.0-only"

PV = "0.4.11"

RPM_NAME = "asco-doc-0.4.11-2.1.noarch.rpm"
RPM_HASH = "5bc6787dc205c1b6e8c0d82e1c550b203757652a00f247302d27580046e6124529765401e85c83464eb5f0c05f89f2b8d2c8592bd39eeee1a59d02a89f29403d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "asco-doc"
RDEPENDS:${PN} += ""

inherit rpm
