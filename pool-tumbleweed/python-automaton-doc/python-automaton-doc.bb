SUMMARY = "Documentation for the Automaton Library"
DESCRIPTION = "Documentation for the Automaton library."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "python-automaton-doc-3.1.0-1.3.noarch.rpm"
RPM_HASH = "61c7f9fe53413f07740d3ad46febc059e0743df6dbfa68422168b06dc45348c3577f52277ffc3669cc5c2c969f05de0a82b6327229c5368762a759be423c1783"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-automaton-doc"

RDEPENDS:${PN} += ""

inherit rpm
