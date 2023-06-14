SUMMARY = "A CV document class with a vertical timeline for experience"
DESCRIPTION = "The class offers another modern, neat, design, and provides a \
simple means of adding an 'experience timeline'."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn26543"

RPM_NAME = "texlive-harnon-cv-2023.201.1.0svn26543-53.1.noarch.rpm"
RPM_HASH = "02e3011a1ce0d76f1623933ed16d98d45df86ab52091cd4c1b0de963f07306c4a00eca56ef48f18e06dd1d62a8063d0abd6d0bbb4066f02a4c6d5e89c39444ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-harnon-cv.cls \
texlive-harnon-cv"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-cantarell.sty \
tex-etoolbox.sty \
tex-fontenc.sty \
tex-framed.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-nopageno.sty \
tex-tabularx.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
