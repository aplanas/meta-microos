SUMMARY = "Documentation for texlive-xnewcommand"
DESCRIPTION = "This package includes the documentation for texlive-xnewcommand"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn15878"

RPM_NAME = "texlive-xnewcommand-doc-2023.201.1.2svn15878-52.1.noarch.rpm"
RPM_HASH = "7185e752cf7f1d288daa0002a25b93a911436e86778f538e80f5eaa8b22cfc9a374fd9584dd07f0bd90a77f56926f6084054fe5d619d3e2cb5472c578e718f43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xnewcommand-doc"

RDEPENDS:${PN} += ""

inherit rpm
