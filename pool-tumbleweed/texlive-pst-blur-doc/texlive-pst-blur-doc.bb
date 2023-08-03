SUMMARY = "Documentation for texlive-pst-blur"
DESCRIPTION = "This package includes the documentation for texlive-pst-blur"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn15878"

RPM_NAME = "texlive-pst-blur-doc-2023.209.2.0svn15878-53.1.noarch.rpm"
RPM_HASH = "379fc687a116a84f9eb57fc9a6bd657795271ff362958cd670108e4647b9c5c790a9862c2ba35e118d85edbb1b76a4409e85cc1e83f00466af37618641523cfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-blur-doc"

RDEPENDS:${PN} += ""

inherit rpm
