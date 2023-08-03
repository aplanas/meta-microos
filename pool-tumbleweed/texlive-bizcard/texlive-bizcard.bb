SUMMARY = "Typeset business cards"
DESCRIPTION = "This is an adaption for current LaTeX of a LaTeX 2.09 style by \
Silvano Balemi. It produces cards at the normal US card size, \
76.2mm x 50.8mm."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-bizcard-2023.209.1.1svn15878-53.1.noarch.rpm"
RPM_HASH = "d1fa6b89fbdf9f9ea9ff3695af75f58ff6c6bebb223de19dd6467daf476288789ae84bd2866f7d7cddbeedffee8688777b3422b3a0e073cc28a323956cc87583"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bizcard.sty \
texlive-bizcard"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-geometry.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
