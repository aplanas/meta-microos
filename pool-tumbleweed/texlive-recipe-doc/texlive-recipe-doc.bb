SUMMARY = "Documentation for texlive-recipe"
DESCRIPTION = "This package includes the documentation for texlive-recipe"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.9svn54080"

RPM_NAME = "texlive-recipe-doc-2023.201.0.0.9svn54080-53.2.noarch.rpm"
RPM_HASH = "0f78cdeb7d576b39e9c743c7b2072e6c03a2b467d0dbc51b928d273e965917d45566267f2a84a9f624403eff36b6078bdd450b7db580894854dfc98e8db850d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-recipe-doc-it \
texlive-recipe-doc"

RDEPENDS:${PN} += ""

inherit rpm
