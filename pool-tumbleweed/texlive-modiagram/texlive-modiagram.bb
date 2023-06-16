SUMMARY = "Drawing molecular orbital diagrams"
DESCRIPTION = "The package provides an environment MOdiagram and some \
commands, to create molecular orbital diagrams using TikZ. For \
example, the MO diagram of dihydrogen would be written as: \
\\begin{MOdiagram} \\atom{left}{ 1s = {0;up} } \\atom{right}{ 1s = \
{0;up} } \\molecule{ 1sMO = {1;pair, } } \\end{MOdiagram} The \
package also needs the l3kernel and l3packages bundles from the \
LaTeX 3 experimental distribution."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3asvn56886"

RPM_NAME = "texlive-modiagram-2023.201.0.0.3asvn56886-54.1.noarch.rpm"
RPM_HASH = "75647379bcc433c6619e7f20b32cc62bce7e272528d8e0e54391e26778c45f6b4ac223e972395e161d19f848379604490450fdcd13e4cc017e275d3fae3b044f"
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
