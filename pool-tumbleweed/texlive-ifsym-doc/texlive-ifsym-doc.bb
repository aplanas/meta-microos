SUMMARY = "Documentation for texlive-ifsym"
DESCRIPTION = "This package includes the documentation for texlive-ifsym"
LICENSE = "LPPL-1.0"

PV = "2023.208.svn24868"

RPM_NAME = "texlive-ifsym-doc-2023.208.svn24868-53.1.noarch.rpm"
RPM_HASH = "667e540253a4e9383987bc239c875b5ebbf29e2eb22ad430be1da3bfbc99d8e0a9180fc70cc3053c6722a0883289961e6db69a697ec17e0a4f4e88c6a8eb8053"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ifsym-doc-de \
texlive-ifsym-doc"

RDEPENDS:${PN} += ""

inherit rpm
