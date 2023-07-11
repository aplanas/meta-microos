SUMMARY = "Class for articles for submission to Elsevier journals"
DESCRIPTION = "This class for typesetting journal articles is accepted for \
submitted articles both in Elsevier's electronic submission \
system and elsewhere. Please note that this webpage is meant \
for uploading updates to the elsarticle software itself, not \
for submitting articles using it ."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.3svn56999"

RPM_NAME = "texlive-elsarticle-2023.201.3.3svn56999-53.2.noarch.rpm"
RPM_HASH = "e8bf6c051176a6766dead233cba2b832fc3999731af9e6dfab5b30d03b53a6873b39a5079489e497826e65d6cb3d9040c27133a19cbbb23dbda6e96f2707d323"
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
