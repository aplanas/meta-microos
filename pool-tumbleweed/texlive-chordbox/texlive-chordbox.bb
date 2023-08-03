SUMMARY = "Draw chord diagrams"
DESCRIPTION = "This package provides two macros for drawing chord diagrams, as \
may be found for example in chord charts/books and educational \
materials. They are composed as TikZ pictures and have several \
options to modify their appearance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn51000"

RPM_NAME = "texlive-chordbox-2023.209.1.0svn51000-54.1.noarch.rpm"
RPM_HASH = "ebceb3f25de56867e3c1d7412c3f67f112e195928eaca1b0fd4cf77911a2afda585a43f8883cc680f7177a274253660d61226c558365c5d188d6790bcaee222b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chordbox.sty \
texlive-chordbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-xifthen.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
