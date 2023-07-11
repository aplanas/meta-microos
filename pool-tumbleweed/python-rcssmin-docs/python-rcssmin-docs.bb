SUMMARY = "Documentation files for python-rcssmin"
DESCRIPTION = "HTML Documentation and examples for python-rcssmin."
LICENSE = "Apache-2.0"

PV = "1.1.1"

RPM_NAME = "python-rcssmin-docs-1.1.1-2.1.aarch64.rpm"
RPM_HASH = "dd987f8ffa6a02915344152061b68ceca92fa68a192804fa7adccb9d7f1d578fedd2a22936c26df2f0dcce0992735b59fd2de26263edec69930a6ca9fb8e2d43"

RPROVIDES:${PN} += "python-rcssmin-docs"

RDEPENDS:${PN} += ""

inherit rpm
