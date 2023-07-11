SUMMARY = "Documentation for texlive-yagusylo"
DESCRIPTION = "This package includes the documentation for texlive-yagusylo"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn29803"

RPM_NAME = "texlive-yagusylo-doc-2023.201.1.2svn29803-52.2.noarch.rpm"
RPM_HASH = "65c80802e20e0e0bb9b8e165dd73baaa10b597626b045607436ad271bb21ddfccae69f849de5f916176f63ea7f6c6435fc5e100d3678c438d76eb62cea7df00d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-yagusylo-doc-fr;en \
texlive-yagusylo-doc"

RDEPENDS:${PN} += ""

inherit rpm
