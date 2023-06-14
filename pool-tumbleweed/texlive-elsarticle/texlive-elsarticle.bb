SUMMARY = "Class for articles for submission to Elsevier journals"
DESCRIPTION = "This class for typesetting journal articles is accepted for \
submitted articles both in Elsevier's electronic submission \
system and elsewhere. Please note that this webpage is meant \
for uploading updates to the elsarticle software itself, not \
for submitting articles using it ."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.3svn56999"

RPM_NAME = "texlive-elsarticle-2023.201.3.3svn56999-53.1.noarch.rpm"
RPM_HASH = "6db3757d7d64bb1b33f8704ba134f3ca583117ff02595d17d54b7019a87406397c1f8737fe396d7ec5c3e15a3e64352c5efa889e018a179e39d4c2c8a7fcec40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-elsarticle.cls \
texlive-elsarticle"

RDEPENDS:${PN} += "/bin/sh \
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
