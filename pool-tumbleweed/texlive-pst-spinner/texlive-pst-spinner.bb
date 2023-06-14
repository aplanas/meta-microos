SUMMARY = "Drawing a fidget spinner"
DESCRIPTION = "This package aims to propose a model of the fidget spinner \
gadget. It exists under different forms with 2, 3 poles and \
even more. We chose the most popular model: the triple Fidget \
Spinner. You can run the PSTricks related documents with \
XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02svn66115"

RPM_NAME = "texlive-pst-spinner-2023.201.1.02svn66115-53.1.noarch.rpm"
RPM_HASH = "0cf7c3229401dd7f670f6fb944b2a6754cb267faed4858a1f02d4046199e224a9ce9c8d427a693ac73cb792d455e5276a9049de21ca856cd3b4d4d90f8c8efcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-spinner.sty \
tex-pst-spinner.tex \
texlive-pst-spinner"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-node.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
