SUMMARY = "Typeset flipbook animations, in the corners of documents"
DESCRIPTION = "The package provides techniques for adding flip book animations \
in the corner of your LaTeX documents (using images or ASCII \
art). Animations are defined as a set of numbered files (e.g., \
'im1.pdf', 'im2.pdf', 'im3.pdf', ...). The package relies on \
fancyhdr to control the corners."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn25584"

RPM_NAME = "texlive-flipbook-2023.209.0.0.2svn25584-53.1.noarch.rpm"
RPM_HASH = "a636a1b2a11cd4362eb2c9b40f5631b90f7cd39bd1a197d647bae535e3e43f937e25afe13a9296cd199c4c30b591089dad4e167659350079d4d6ddeff69006e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-flipbook.sty \
texlive-flipbook"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-everypage.sty \
tex-fancyhdr.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-scalefnt.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
