SUMMARY = "Documentation for texlive-biblatex-anonymous"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-anonymous"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.6.2svn48548"

RPM_NAME = "texlive-biblatex-anonymous-doc-2023.201.2.6.2svn48548-53.1.noarch.rpm"
RPM_HASH = "65e29e1813fdf98d5ddf5380d3a349292948d01d15c2bfb7712da9c57366437e3ecabc1a716f8c112727535333d3b34a92f50ed30c7b762442192fb41b543dae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-anonymous-doc"

RDEPENDS:${PN} += ""

inherit rpm
