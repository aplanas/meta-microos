SUMMARY = "Documentation for texlive-firstaid"
DESCRIPTION = "This package includes the documentation for texlive-firstaid"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0usvn64892"

RPM_NAME = "texlive-firstaid-doc-2023.201.1.0usvn64892-52.1.noarch.rpm"
RPM_HASH = "c5f20a675efd263b48d2cc04887dda129130d78098db5541fc55c92a39c037f4c6436f2168c86916ad3d850a55ff3aeeac928d8300d3d0cc94882c6a49c4f6bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-firstaid-doc"
RDEPENDS:${PN} += ""

inherit rpm
