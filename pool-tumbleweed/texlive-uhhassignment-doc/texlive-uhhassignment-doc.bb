SUMMARY = "Documentation for texlive-uhhassignment"
DESCRIPTION = "This package includes the documentation for texlive-uhhassignment"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn44026"

RPM_NAME = "texlive-uhhassignment-doc-2023.201.1.0svn44026-53.1.noarch.rpm"
RPM_HASH = "96e9b228d09c6b2ed13dbdcc4b02802ff97811fe37a6069a83d3c8db1dc612ed16f78d8e8d338a3ee5eb56176c6634e3e32b8699842b73d796f7f07092b31e83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uhhassignment-doc"

RDEPENDS:${PN} += ""

inherit rpm
