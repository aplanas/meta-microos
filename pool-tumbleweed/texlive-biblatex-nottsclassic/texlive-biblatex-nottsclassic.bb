SUMMARY = "Citation style for the University of Nottingham"
DESCRIPTION = "This citation-style covers the citation and bibliography rules \
of the University of Nottingham."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn41596"

RPM_NAME = "texlive-biblatex-nottsclassic-2023.209.0.0.1svn41596-54.1.noarch.rpm"
RPM_HASH = "493f01f2f9196a9018ec9699a675b8108281eecec9e3ef40f7b9c1e9025caaa7f17dde18b045bd66c5ae2c7a880ccb0a440717ce97828eb837665b92be331142"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nottsclassic-english.lbx \
tex-nottsclassic.bbx \
tex-nottsclassic.cbx \
texlive-biblatex-nottsclassic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authoryear.bbx \
tex-british.sty \
tex-csquotes.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
