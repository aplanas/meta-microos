SUMMARY = "Documentation for texlive-latex-git-log"
DESCRIPTION = "This package includes the documentation for texlive-latex-git-log"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0.0svn54010"

RPM_NAME = "texlive-latex-git-log-doc-2023.201.1.0.0svn54010-55.1.noarch.rpm"
RPM_HASH = "2df5a434c8ed15ab8acd9073a8667d48a5f69ac8e6252b881e03693fb76cd079ee706fa685acbc457fcad5577059c946e2e05fa324e2abf343dc270ab0cfbe23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-latex-git-log.1 \
texlive-latex-git-log-doc"

RDEPENDS:${PN} += ""

inherit rpm
