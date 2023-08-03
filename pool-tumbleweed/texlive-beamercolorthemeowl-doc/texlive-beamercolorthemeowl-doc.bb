SUMMARY = "Documentation for texlive-beamercolorthemeowl"
DESCRIPTION = "This package includes the documentation for texlive-beamercolorthemeowl"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.1svn40105"

RPM_NAME = "texlive-beamercolorthemeowl-doc-2023.209.0.0.1.1svn40105-54.1.noarch.rpm"
RPM_HASH = "4091c5bebd90e2f820b73c576e1ae25e0ee71a834aee6f2898919afb91c15bbffc4e13a79a8677ce8bb48e404882a3b387f112028c806e29a4976e254f7be238"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamercolorthemeowl-doc"

RDEPENDS:${PN} += ""

inherit rpm
