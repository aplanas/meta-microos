SUMMARY = "Documentation for texlive-xnewcommand"
DESCRIPTION = "This package includes the documentation for texlive-xnewcommand"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn15878"

RPM_NAME = "texlive-xnewcommand-doc-2023.201.1.2svn15878-52.2.noarch.rpm"
RPM_HASH = "1f0a1164df6baeed06d0fca3a2f77d67dd26f76a0ff7419f09aca1fbb1dcd47b2dcd3fbf49a9b51e0d714ac032dd6556318a1f18465c158f87062eed47ef888e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xnewcommand-doc"

RDEPENDS:${PN} += ""

inherit rpm
