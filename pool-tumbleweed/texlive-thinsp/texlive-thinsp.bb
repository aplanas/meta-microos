SUMMARY = "A stretchable \\thinspace for LaTeX"
DESCRIPTION = "The package redefines \\thinspace to have a stretch component."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.2svn39669"

RPM_NAME = "texlive-thinsp-2023.209.0.0.2svn39669-55.1.noarch.rpm"
RPM_HASH = "ab0f6941d5e83ae4a99e7f969f30276f1045790054ac830cf355eebdb3499ccc6331e5c4c835bf22c8a4eff0feb8dc720f03989f1c8bdb2b57953c4cf441646b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-thinsp.sty \
texlive-thinsp"

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
