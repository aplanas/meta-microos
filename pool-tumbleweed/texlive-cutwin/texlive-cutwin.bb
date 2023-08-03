SUMMARY = "Cut a window in a paragraph, typeset material in it"
DESCRIPTION = "The package provides facilities to cut windows out of \
paragraphs, and to typeset text or other material in the \
window. The window may be rectangular, or may have other sorts \
of shape."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn60901"

RPM_NAME = "texlive-cutwin-2023.209.0.0.2svn60901-55.1.noarch.rpm"
RPM_HASH = "9aa954427928d8f04bf0475df969cf40563ab4ce92b1866a3d46f78167ac666997cae78d1146feeba7ece8a3bc8927bc2bd58c646bce9730a0985800930b6264"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cutwin.sty \
texlive-cutwin"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
