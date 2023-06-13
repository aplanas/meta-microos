SUMMARY = "Documentation for texlive-latex-fonts"
DESCRIPTION = "This package includes the documentation for texlive-latex-fonts"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn28888"

RPM_NAME = "texlive-latex-fonts-doc-2023.201.svn28888-55.1.noarch.rpm"
RPM_HASH = "e97df1198c348ad8493248dc99969c01ed00797f5524c5cfd8bdb76d9b5c3892a6fd4986cc81ba2c7d0fd59f441f756e41873ad8819a96e516bc8a4dd0922bbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-fonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
