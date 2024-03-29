SUMMARY = "Class for articles for submission to Elsevier journals"
DESCRIPTION = "This class for typesetting journal articles is accepted for \
submitted articles both in Elsevier's electronic submission \
system and elsewhere. Please note that this webpage is meant \
for uploading updates to the elsarticle software itself, not \
for submitting articles using it ."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.3svn56999"

RPM_NAME = "texlive-elsarticle-2023.209.3.3svn56999-54.2.noarch.rpm"
RPM_HASH = "bd60487cc6c238e6c601fd83cd34a4633518d1899ce9669211480a908c6a67e3cfb0e792c73a6bea43f6197267f54fcf5a99d157151725948f5aaffcc96f339c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-elsarticle.cls \
texlive-elsarticle"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-endfloat.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-fleqn.clo \
tex-geometry.sty \
tex-graphicx.sty \
tex-natbib.sty \
tex-times.sty \
tex-txfonts.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
