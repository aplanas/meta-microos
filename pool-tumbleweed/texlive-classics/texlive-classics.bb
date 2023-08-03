SUMMARY = "Cite classic works"
DESCRIPTION = "The package provides a basic framework to cite classic works \
(specially from authors such as Homer, Plato, Aristotle, \
Descartes, Hume, and Kant) in accordance with traditional \
pagination systems. It may be used in conjunction with other \
citation packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1asvn53671"

RPM_NAME = "texlive-classics-2023.209.0.0.1asvn53671-54.1.noarch.rpm"
RPM_HASH = "e167f92c70eb6e324d640802b565053f8fa249b4a4d14abc1e01878c2dc22bf89273c67a9df71834625f1e98a6c7ae479b2500dd59095fcefe5d148a150397d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-classics.sty \
texlive-classics"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
