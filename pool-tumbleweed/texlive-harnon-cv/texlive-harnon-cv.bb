SUMMARY = "A CV document class with a vertical timeline for experience"
DESCRIPTION = "The class offers another modern, neat, design, and provides a \
simple means of adding an 'experience timeline'."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn26543"

RPM_NAME = "texlive-harnon-cv-2023.201.1.0svn26543-53.2.noarch.rpm"
RPM_HASH = "b460910220f0c83760ac1aab570991dc1fdba90b6d3f8be64b473e7eb4ea1f9fa68d279350cb198ea72457e3f85f30e7bde6606ee30c177c9c3f5e259c2aceb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-harnon-cv.cls \
texlive-harnon-cv"

RDEPENDS:${PN} += "/usr/bin/sh \
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
