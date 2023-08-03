SUMMARY = "University of Arizona thesis and dissertation format"
DESCRIPTION = "This package provides a LaTeX2e document class named \
'ua-thesis' for typesetting theses and dissertations in the \
official format required by the University of Arizona. \
Moreover, there is a fully compatible alternative document \
class 'my-thesis' for private 'nice' copies of the \
dissertation, and the respective title pages are available as \
separate packages to work with any document class."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-uaclasses-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "72d1931d7559467b85cf965d2b52e5e651ba3edb3968b4a4506e2aed48c66e1d311adba59862ae63a08859a8f1b510e13ff4257f41a96c2a52dfae04bec421a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-my-thesis.cls \
tex-my-title.sty \
tex-ua-thesis.cls \
tex-ua-title.sty \
texlive-uaclasses"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsbook.cls \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amsthm.sty \
tex-report.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
