SUMMARY = "Generate calling cards for dances"
DESCRIPTION = "A package and a class used to typeset traditional country \
dances, such as contra and square dances, and to create calling \
cards for the same."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.0svn50217"

RPM_NAME = "texlive-contracard-2023.209.2.0.0svn50217-55.1.noarch.rpm"
RPM_HASH = "93932966c9acf5da19ae4827c056dac3baa5677e995515ff50e7af3776f281458de6a703ee3ac8a02785247329cf99080572ae9b34782c29bcd1a84386e4da01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-contracard.cls \
tex-contracard.sty \
texlive-contracard"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-geometry.sty \
tex-ifthen.sty \
tex-imakeidx.sty \
tex-intcalc.sty \
tex-textcomp.sty \
tex-titlesec.sty \
tex-tocloft.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
