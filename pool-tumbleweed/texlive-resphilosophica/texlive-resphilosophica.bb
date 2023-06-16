SUMMARY = "Typeset articles for the journal Res Philosophica"
DESCRIPTION = "The bundle provides a class for typesetting articles for the \
journal Res Philosophica. This work was commissioned by the \
Saint Louis University."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.35svn50935"

RPM_NAME = "texlive-resphilosophica-2023.201.1.35svn50935-53.1.noarch.rpm"
RPM_HASH = "ee9f170db29d2763ccc3f022d9b3fc26f3893b5a96bb3a644580371efefe88d4d4b6e467e52335adcc9f9cef9a64707d5f01f08046f1738b7d8be8d75b4d1c07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-resphilosophica.cls \
texlive-resphilosophica"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsart.cls \
tex-collect.sty \
tex-fancyhdr.sty \
tex-footmisc.sty \
tex-hyperref.sty \
tex-lastpage.sty \
tex-mathdesign.sty \
tex-microtype.sty \
tex-natbib.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
