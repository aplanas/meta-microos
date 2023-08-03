SUMMARY = "Typeset articles for the journal Res Philosophica"
DESCRIPTION = "The bundle provides a class for typesetting articles for the \
journal Res Philosophica. This work was commissioned by the \
Saint Louis University."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.35svn50935"

RPM_NAME = "texlive-resphilosophica-2023.209.1.35svn50935-54.1.noarch.rpm"
RPM_HASH = "0fc598b16a70b8d79b2cc77febb5075f7ce73db4c9be039ac7473bdcba531960f19b458d207810dd3c4dda4b2dc1bc30d19c71c05cf70eb281dcbc781fc0b1af"
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
