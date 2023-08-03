SUMMARY = "A CV document class with a vertical timeline for experience"
DESCRIPTION = "The class offers another modern, neat, design, and provides a \
simple means of adding an 'experience timeline'."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn26543"

RPM_NAME = "texlive-harnon-cv-2023.209.1.0svn26543-54.1.noarch.rpm"
RPM_HASH = "a5f16b91e99753c4c8318cd8132c494e7c47d525ae8e43e0f195fa4a7fc69c991ed94eeaeb8239e5e67961218c666d826e21651d3310455630a3e15927c136dd"
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
