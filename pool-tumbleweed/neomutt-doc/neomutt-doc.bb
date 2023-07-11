SUMMARY = "Additional documentation for neomutt"
DESCRIPTION = "Documentation for NeoMutt with neomuttrc examples for different environments \
and requirements."
LICENSE = "GPL-2.0-or-later"

PV = "20230517"

RPM_NAME = "neomutt-doc-20230517-1.2.noarch.rpm"
RPM_HASH = "3754a257d3be72b55774ebb0fdd41ea98e4269ff98faa6d90f550fdd1972a4df11808b89876028eae09f4182f45cf6267a2873cc39d22e1fe5fb1eba0768a4fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "neomutt-doc"

RDEPENDS:${PN} += "neomutt"

inherit rpm
