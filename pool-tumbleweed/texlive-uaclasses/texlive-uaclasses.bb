SUMMARY = "University of Arizona thesis and dissertation format"
DESCRIPTION = "This package provides a LaTeX2e document class named \
'ua-thesis' for typesetting theses and dissertations in the \
official format required by the University of Arizona. \
Moreover, there is a fully compatible alternative document \
class 'my-thesis' for private 'nice' copies of the \
dissertation, and the respective title pages are available as \
separate packages to work with any document class."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-uaclasses-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "b8cad33721bc607387d2552624663118cbb1ec9c82500c5c510dca139b376929175d1facde412dda0c04611a191067d08a0c3baade2df5c09effeece934d0d95"
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
