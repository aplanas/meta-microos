SUMMARY = "BibLaTeX citations for FU Berlin"
DESCRIPTION = "The bundle provides a set of BibLaTeX implementations of \
bibliography and citation styles for the Business \
Administration Department of the Free University of Berlin."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn26556"

RPM_NAME = "texlive-biblatex-bwl-2023.209.0.0.02svn26556-54.1.noarch.rpm"
RPM_HASH = "7915abc2b81bbb8c65c4eb1d91e2df295d287b5a2dc52fb3af76735caa73738aadf5448758d2b771bc1584c4d3758cf03a94169d31c971cada2d888009358573"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bwl-FU.bbx \
tex-bwl-FU.cbx \
texlive-biblatex-bwl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authoryear.bbx \
tex-authoryear.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
