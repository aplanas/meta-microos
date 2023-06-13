SUMMARY = "Documentation for texlive-conteq"
DESCRIPTION = "This package includes the documentation for texlive-conteq"
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.1.1svn37868"

RPM_NAME = "texlive-conteq-doc-2023.204.0.0.1.1svn37868-54.1.noarch.rpm"
RPM_HASH = "f5046c85568d0e550d09467fd869087062acc51b8da1e0dd9c8ad215b453e12d56284fd01b6783ecacc9219257ffbb7a52c8787ebbeb73dcb277e7d3fc4ffc15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-conteq-doc"

RDEPENDS:${PN} += ""

inherit rpm
