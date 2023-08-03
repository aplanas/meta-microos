SUMMARY = "Documentation for texlive-vancouver"
DESCRIPTION = "This package includes the documentation for texlive-vancouver"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn59192"

RPM_NAME = "texlive-vancouver-doc-2023.209.1.0svn59192-54.1.noarch.rpm"
RPM_HASH = "74807bc593a480c859b8ea5a440839c4a38566b6d0a13d99c63cc326d7d9e53444ed948c12de6c44e372769770d114062b8b2b10119d64b0e4d3b9bf4ac24c53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vancouver-doc"

RDEPENDS:${PN} += ""

inherit rpm
