SUMMARY = "Documentation for texlive-quotmark"
DESCRIPTION = "This package includes the documentation for texlive-quotmark"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-quotmark-doc-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "dae16f018092eb438672d282aa3926d18fbaf2b9f47044fdb881f3c61e50dbf030d2ebfba2b9198049074fb2731d8bf7b79abc5791045a73c7e9c6f68785dd94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quotmark-doc"

RDEPENDS:${PN} += ""

inherit rpm
