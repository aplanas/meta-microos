SUMMARY = "Typeset articles for the journal Res Philosophica"
DESCRIPTION = "The bundle provides a class for typesetting articles for the \
journal Res Philosophica. This work was commissioned by the \
Saint Louis University."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.35svn50935"

RPM_NAME = "texlive-resphilosophica-2023.209.1.35svn50935-54.2.noarch.rpm"
RPM_HASH = "bc6479faaee2551206f71036ce1c2ed71a220e9aa8a19107b6b842e042ab057fe31b7b6773f748bf4d025fa4fd5f2090b093b7cc88fa150f3b3339662ba5249f"
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
