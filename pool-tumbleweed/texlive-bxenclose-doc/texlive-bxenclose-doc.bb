SUMMARY = "Documentation for texlive-bxenclose"
DESCRIPTION = "This package includes the documentation for texlive-bxenclose"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn40213"

RPM_NAME = "texlive-bxenclose-doc-2023.201.0.0.2svn40213-52.1.noarch.rpm"
RPM_HASH = "b4fa066fea7a17de098222d17a2127752372f0d79f1fc313950d97ef16a66e024cdfc03c720da2f3e9748fbcc087966d942626e71d67cabd00d4b373f45c49cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxenclose-doc"

RDEPENDS:${PN} += ""

inherit rpm
