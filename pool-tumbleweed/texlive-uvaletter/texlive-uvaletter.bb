SUMMARY = "Unofficial letterhead template for the University of Amsterdam"
DESCRIPTION = "This is an unofficial LaTeX package that provides a letterhead \
template for the University of Amsterdam. The design mimics the \
official Word template of the University and complies with the \
University's house style."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.0svn66330"

RPM_NAME = "texlive-uvaletter-2023.209.1.1.0svn66330-54.1.noarch.rpm"
RPM_HASH = "37978a7bcd3aab25f5c96cd712d9c3ee0ea2b2a910fc1f42dc0a6949fed82933394d7b039da0debd738d50e9292b85c7a694232b1c44293e75f8c6447458702e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uvaletter.sty \
texlive-uvaletter"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-lastpage.sty \
tex-microtype.sty \
tex-setspace.sty \
tex-soul.sty \
tex-times.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
