SUMMARY = "Create canonical page layouts with memoir"
DESCRIPTION = "A canonic text layout has specified relations to a circle \
inscribed within the enclosing page. The package allows the \
user to use a canonic layout with the memoir class."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn64889"

RPM_NAME = "texlive-canoniclayout-2023.201.1.0svn64889-52.1.noarch.rpm"
RPM_HASH = "601c13e4d5df12686df8c44cf2a07028dc8a34752dd1031e8a2a707e7f11bd0dd8ff803e7c42ca05c9a04ee32de23ed289c3a5dfda80aa9f21fe9bad7f7b195c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-canoniclayout.sty \
texlive-canoniclayout"

RDEPENDS:${PN} += "/bin/sh \
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
