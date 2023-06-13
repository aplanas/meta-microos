SUMMARY = "Documentation for texlive-continue"
DESCRIPTION = "This package includes the documentation for texlive-continue"
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.2svn49449"

RPM_NAME = "texlive-continue-doc-2023.204.0.0.2svn49449-54.1.noarch.rpm"
RPM_HASH = "24b95e4ec58b25f29a6945b90854cbf93b4a718930969d8c52817416dd0a5127e9d90207800eb47a4000dd2b21ee513b93fb7023bfab5154a6f932856e2a97e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-continue-doc"

RDEPENDS:${PN} += ""

inherit rpm
