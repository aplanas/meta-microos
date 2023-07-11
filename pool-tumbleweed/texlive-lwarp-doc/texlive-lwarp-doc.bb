SUMMARY = "Documentation for texlive-lwarp"
DESCRIPTION = "This package includes the documentation for texlive-lwarp"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.911svn66259"

RPM_NAME = "texlive-lwarp-doc-2023.208.0.0.911svn66259-53.1.noarch.rpm"
RPM_HASH = "274aa9d3bdb3400f4c91e6b767f7564a285480e50b9dcbc87f7f78829ab4df46c5336959dbbad8eb816755df831af368f105482141a7297d2b85f53f3423ac04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lwarp-doc"

RDEPENDS:${PN} += ""

inherit rpm
