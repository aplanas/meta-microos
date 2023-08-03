SUMMARY = "Documentation for texlive-binomexp"
DESCRIPTION = "This package includes the documentation for texlive-binomexp"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-binomexp-doc-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "4c72dffdfa1f79d73485cc51b8785cad5fd787ba07b5967e408d3929831259e1753f99577a793b6748a6472fa7c26095926d4a4d0890d4af8be54df4126b2979"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-binomexp-doc"

RDEPENDS:${PN} += ""

inherit rpm
