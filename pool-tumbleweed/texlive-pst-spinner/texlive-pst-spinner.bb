SUMMARY = "Drawing a fidget spinner"
DESCRIPTION = "This package aims to propose a model of the fidget spinner \
gadget. It exists under different forms with 2, 3 poles and \
even more. We chose the most popular model: the triple Fidget \
Spinner. You can run the PSTricks related documents with \
XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn66115"

RPM_NAME = "texlive-pst-spinner-2023.209.1.02svn66115-54.1.noarch.rpm"
RPM_HASH = "8ade70fe0655b5bcc635e3d3735621e33a1140a58d6e5159c4438914d74ade3be5bb399010085e3a06c046c93334ab727b8add92c5425096710cdbd234bf97c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-spinner.sty \
tex-pst-spinner.tex \
texlive-pst-spinner"

RDEPENDS:${PN} += "/usr/bin/sh \
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
