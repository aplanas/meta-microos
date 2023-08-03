SUMMARY = "A LaTeX package to typeset (Italian) high school tests"
DESCRIPTION = "The purpose of this package is to manage the exercises for a \
test, their points, levels of difficulty, and solutions. Some \
typical formats of exercises are already implemented: Plain \
exercise 'Complete the Text' 'True or false' Closed questions \
Open questions 'Find the error'"
LICENSE = "LPPL-1.0"

PV = "2023.209.6.0svn64425"

RPM_NAME = "texlive-verifiche-2023.209.6.0svn64425-54.1.noarch.rpm"
RPM_HASH = "799a7999a48acad9df8726bde3375615acfcbaddc99a0942ed69c9cab267446633b179359cdca3d7462945ae5bf8d557f13f0c47540a7a761876172fab4f3fa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-verifiche.sty \
texlive-verifiche"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-booktabs.sty \
tex-enumitem.sty \
tex-graphicx.sty \
tex-pgffor.sty \
tex-siunitx.sty \
tex-tikz.sty \
tex-ulem.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
