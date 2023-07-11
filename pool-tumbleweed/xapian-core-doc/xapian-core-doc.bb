SUMMARY = "Documentation for the xapian-core libraries"
DESCRIPTION = "Xapian is a Probabilistic Information Retrieval library. \
 \
This subpackage provides the documentation for Xapian."
LICENSE = "GPL-2.0-only"

PV = "1.4.21"

RPM_NAME = "xapian-core-doc-1.4.21-1.4.aarch64.rpm"
RPM_HASH = "ebcbc50aa8c29fc2f21604e52253c37b00057847faee5c4220a6da950c13aab67462b5f4408f28ce8fdb5249b0bb78b5acf050e423e13823b6c12c868ff56bff"

RPROVIDES:${PN} += "xapian-core-doc"

RDEPENDS:${PN} += "xapian-core"

inherit rpm
