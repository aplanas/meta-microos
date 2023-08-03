SUMMARY = "Documentation for texlive-tikzpagenodes"
DESCRIPTION = "This package includes the documentation for texlive-tikzpagenodes"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64967"

RPM_NAME = "texlive-tikzpagenodes-doc-2023.209.1.1svn64967-53.1.noarch.rpm"
RPM_HASH = "8dd34921840bb6c78ed52ec20826710785437ae74139add13ca94b2b0ef8e515cdc1e87635cf1ffa81cb856614ec08de1eec8067e3a1e99f3afa3e3c08b5c5c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzpagenodes-doc"

RDEPENDS:${PN} += ""

inherit rpm
