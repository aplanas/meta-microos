SUMMARY = "Documentation for texlive-randomwalk"
DESCRIPTION = "This package includes the documentation for texlive-randomwalk"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6svn49513"

RPM_NAME = "texlive-randomwalk-doc-2023.201.0.0.6svn49513-53.2.noarch.rpm"
RPM_HASH = "b0c85b53015ee77b13893d4f00ea5a348543dc25f78394186a3ba094d9afb96d6f5af079074e7b63af004d45bf31e8e1697ee52bad1c4d5430e802052205a1ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-randomwalk-doc"

RDEPENDS:${PN} += ""

inherit rpm
