SUMMARY = "Typeset articles for the journal Res Philosophica"
DESCRIPTION = "The bundle provides a class for typesetting articles for the \
journal Res Philosophica. This work was commissioned by the \
Saint Louis University."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.35svn50935"

RPM_NAME = "texlive-resphilosophica-2023.201.1.35svn50935-53.2.noarch.rpm"
RPM_HASH = "27a7cb4914fe15cc67c204885778d7e5dfb742c8e18458b77593eb4c1e01a85dc14d38552c935bea5dfc6e5893ac700d86b3d6da7d2e0ac71cd14769a3b514c1"
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
