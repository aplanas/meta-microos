SUMMARY = "A CV document class with a vertical timeline for experience"
DESCRIPTION = "The class offers another modern, neat, design, and provides a \
simple means of adding an 'experience timeline'."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn26543"

RPM_NAME = "texlive-harnon-cv-2023.209.1.0svn26543-54.2.noarch.rpm"
RPM_HASH = "c355d2abfc59abb13d3b09f01074adb41b7f0649f35a05d2f4dd315cf12bd24a578c3f55583fd6b38be9504272cc9f2853855196cd8123e4efcdcc3e519a0253"
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
