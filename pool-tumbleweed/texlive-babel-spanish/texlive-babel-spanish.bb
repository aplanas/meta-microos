SUMMARY = "Babel support for Spanish"
DESCRIPTION = "This bundle provides the means to typeset Spanish text, with \
the support provided by the LaTeX standard package babel. Note \
that separate support is provided for those who wish to typeset \
Spanish as written in Mexico."
LICENSE = "LPPL-1.0"

PV = "2023.201.5.0qsvn59367"

RPM_NAME = "texlive-babel-spanish-2023.201.5.0qsvn59367-53.1.noarch.rpm"
RPM_HASH = "1eecabee13fb569adb14be1bfa0b60f5c5dc2f919c2df2a22f15c9b0a79ab7574cd0aecba74e11f8ce952f0ba5effad7f51e0d5c5de5e8aef31f32a7c1367cc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(romanidx.sty) \
tex(spanish.ldf) \
texlive-babel-spanish"
RDEPENDS:${PN} += "/bin/sh \
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
