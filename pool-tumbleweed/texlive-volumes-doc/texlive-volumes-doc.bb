SUMMARY = "Documentation for texlive-volumes"
DESCRIPTION = "This package includes the documentation for texlive-volumes"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-volumes-doc-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "c5c900f741d76db386d3c42befd94dff3f1b1b947269a202e3d54c46abc135e551530916755d5753746adcbed3a28bcc6f00abd07b85ff9a9bac8f741f38cc5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-volumes-doc"
RDEPENDS:${PN} += ""

inherit rpm
