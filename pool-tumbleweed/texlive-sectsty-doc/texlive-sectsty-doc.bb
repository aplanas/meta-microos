SUMMARY = "Documentation for texlive-sectsty"
DESCRIPTION = "This package includes the documentation for texlive-sectsty"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.2svn15878"

RPM_NAME = "texlive-sectsty-doc-2023.209.2.0.2svn15878-54.1.noarch.rpm"
RPM_HASH = "57feb5cf205825c047795f547f0edd1d59d98ece07b1b8c50c65cee30d6a7138988e601c0014c936e5c922f1924f19715bb1ee85a261e74ae623f7850b711292"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sectsty-doc"

RDEPENDS:${PN} += ""

inherit rpm
