SUMMARY = "Documentation for texlive-turabian"
DESCRIPTION = "This package includes the documentation for texlive-turabian"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.0svn36298"

RPM_NAME = "texlive-turabian-doc-2023.201.0.0.1.0svn36298-52.1.noarch.rpm"
RPM_HASH = "b768770bc0e89b3426872e9e3deaddad381a9944c6772df03137af35bcc7408436ee441366f3697a1c239a0630442b570d4b1e2de2786d185536f0656ecedb06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-turabian-doc"

RDEPENDS:${PN} += ""

inherit rpm
