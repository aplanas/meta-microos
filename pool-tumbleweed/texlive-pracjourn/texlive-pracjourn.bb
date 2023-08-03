SUMMARY = "Typeset articles for PracTeX"
DESCRIPTION = "The pracjourn class is used for typesetting articles in the \
PracTeX Journal. It is based on the article class with \
modifications to allow for more flexible front-matter and \
revision control, among other small changes."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.4nsvn61719"

RPM_NAME = "texlive-pracjourn-2023.209.0.0.4nsvn61719-53.1.noarch.rpm"
RPM_HASH = "984d570431ace8b73fcfa0819e93bce20e1cfae089f17a34ada4d4da5c5ef177647fb9b4940cf107e854c48f0dbf16d6b4daf4589f71a177f097ff9e2616b39d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pracjourn.cls \
texlive-pracjourn"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-lmodern.sty \
tex-mathpazo.sty \
tex-microtype.sty \
tex-textcomp.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
