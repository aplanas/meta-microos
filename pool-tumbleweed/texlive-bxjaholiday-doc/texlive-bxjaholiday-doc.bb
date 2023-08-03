SUMMARY = "Documentation for texlive-bxjaholiday"
DESCRIPTION = "This package includes the documentation for texlive-bxjaholiday"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.1svn60636"

RPM_NAME = "texlive-bxjaholiday-doc-2023.209.1.1.1svn60636-53.1.noarch.rpm"
RPM_HASH = "341da04b6a45fd8f5ff5991ce066f382a4bbbd40b7f0a86d6726713b15b6a6212dfb02d461388e64498b8f0f955f8fea1642a0b1bd0ae4d97331194f750d0246"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-bxjaholiday-doc-ja \
texlive-bxjaholiday-doc"

RDEPENDS:${PN} += ""

inherit rpm
