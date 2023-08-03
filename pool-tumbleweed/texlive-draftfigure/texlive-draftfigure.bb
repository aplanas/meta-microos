SUMMARY = "Replace figures with a white box and additional features"
DESCRIPTION = "With this package you can control the outcome of a figure which \
is set to draft and modify the display with various options."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn44854"

RPM_NAME = "texlive-draftfigure-2023.209.0.0.2svn44854-53.1.noarch.rpm"
RPM_HASH = "817f57eadde64feaf231b04a362d80d6eed66fac3c46344a1992f3c56772881c2ce63e963062b4bf4afc078a2d3108252068a3a3e91b00e94f0241aaadf8faf0"
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
