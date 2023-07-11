SUMMARY = "Documentation for texlive-qsymbols"
DESCRIPTION = "This package includes the documentation for texlive-qsymbols"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-qsymbols-doc-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "63b30014dbeb01238eb44e28d7a4e1e168a6f5550b01aea50b6df7fed8696068ef01024b39fbd43ebd8d06aa006db43d3d2210dfbecdece0e7ea655610a54003"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qsymbols-doc"

RDEPENDS:${PN} += ""

inherit rpm
