SUMMARY = "Documentation for texlive-schola-otf"
DESCRIPTION = "This package includes the documentation for texlive-schola-otf"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn64734"

RPM_NAME = "texlive-schola-otf-doc-2023.209.0.0.01svn64734-54.1.noarch.rpm"
RPM_HASH = "9b919f04f57f456c123db1a4d2e7b30e1c96feba3a20d43e4247553b91d8a933e8c7806af771b2c1a31fcaa95aa4d5f80063d7c008d75c5d16fc3b813aa4132e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-schola-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
