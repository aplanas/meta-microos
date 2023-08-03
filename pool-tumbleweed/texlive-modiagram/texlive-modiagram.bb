SUMMARY = "Drawing molecular orbital diagrams"
DESCRIPTION = "The package provides an environment MOdiagram and some \
commands, to create molecular orbital diagrams using TikZ. For \
example, the MO diagram of dihydrogen would be written as: \
\\begin{MOdiagram} \\atom{left}{ 1s = {0;up} } \\atom{right}{ 1s = \
{0;up} } \\molecule{ 1sMO = {1;pair, } } \\end{MOdiagram} The \
package also needs the l3kernel and l3packages bundles from the \
LaTeX 3 experimental distribution."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3asvn56886"

RPM_NAME = "texlive-modiagram-2023.209.0.0.3asvn56886-55.1.noarch.rpm"
RPM_HASH = "c2477382bde294bc226fd3bb71814adb4139c91302f7fab7977b24a441705164acaaededd397c8e9ae1b35a0fd19f7ad45d5457f3abdef076a433dbcdec1f6ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-modiagram.sty \
texlive-modiagram"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-chemgreek.sty \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
