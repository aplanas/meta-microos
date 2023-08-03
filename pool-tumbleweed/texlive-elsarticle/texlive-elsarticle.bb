SUMMARY = "Class for articles for submission to Elsevier journals"
DESCRIPTION = "This class for typesetting journal articles is accepted for \
submitted articles both in Elsevier's electronic submission \
system and elsewhere. Please note that this webpage is meant \
for uploading updates to the elsarticle software itself, not \
for submitting articles using it ."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.3svn56999"

RPM_NAME = "texlive-elsarticle-2023.209.3.3svn56999-54.1.noarch.rpm"
RPM_HASH = "6a656ba4306716b75761d2d759def1efee55342878eae5b0d92d5ed781bf69aacccfad0a837e947385820b3517dfb6b0a90c5c09e0a54eb70246b9a99fdc7c09"
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
