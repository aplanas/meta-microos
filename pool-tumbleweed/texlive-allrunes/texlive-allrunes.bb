SUMMARY = "Fonts and LaTeX package for almost all runes"
DESCRIPTION = "This large collection of fonts (in Adobe Type 1 format), with \
the LaTeX package gives access to almost all runes ever used in \
Europe. The bundle covers not only the main forms but also a \
lot of varieties."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1.1svn42221"

RPM_NAME = "texlive-allrunes-2023.201.2.1.1svn42221-54.1.noarch.rpm"
RPM_HASH = "f721924555f2a5951884f8b3c0e0bb40b763fc823515dd99921cf905875c82e4a0ee28f8db6ff7fe2eb4fc040e5780a637fa8c4802809636a5b462c692283fdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-allrunes.map \
tex-allrunes.sty \
tex-ara.fd \
tex-arc.fd \
tex-arl.fd \
tex-arm.fd \
tex-arn.fd \
tex-art.fd \
texlive-allrunes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-updmap.cfg \
texlive \
texlive-allrunes-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
