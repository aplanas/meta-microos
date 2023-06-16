SUMMARY = "Replace figures with a white box and additional features"
DESCRIPTION = "With this package you can control the outcome of a figure which \
is set to draft and modify the display with various options."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn44854"

RPM_NAME = "texlive-draftfigure-2023.201.0.0.2svn44854-52.1.noarch.rpm"
RPM_HASH = "2d25a1095bef8e2105e47e907d3a8d8057a69049a4bdc27d83f38b4437e7a0bee2cd1d7b13930cfeb6d224b618a046b357b26476f4d3fb4b7230b7165c2d9130"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-draftfigure.sty \
texlive-draftfigure"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
