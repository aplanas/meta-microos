SUMMARY = "Create canonical page layouts with memoir"
DESCRIPTION = "A canonic text layout has specified relations to a circle \
inscribed within the enclosing page. The package allows the \
user to use a canonic layout with the memoir class."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn64889"

RPM_NAME = "texlive-canoniclayout-2023.209.1.0svn64889-53.1.noarch.rpm"
RPM_HASH = "56b91831b1b75ea6a1a8f48a960904f6d0f368c731fc6fe23dc3a6861f89b9a6cfd57f17bcf59ab40d111426538ace03c4e824b3cb9f63d9cea5c6ba08c69ea5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-canoniclayout.sty \
texlive-canoniclayout"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-pict2e.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
