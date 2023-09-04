SUMMARY = "A library to typeset ZX Calculus diagrams"
DESCRIPTION = "This library (based on the great TikZ and TikZ-cd packages) \
allows you to typeset ZX-calculus directly in LaTeX. It comes \
with many pre-built wire shapes, a highly customizable node \
style (with multiple flavours for putting labels inside or \
outside nodes), and a 'debugging' mode to avoid getting lost in \
big diagrams."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn60838"

RPM_NAME = "texlive-zx-calculus-2023.209.svn60838-53.2.noarch.rpm"
RPM_HASH = "b766d7a2b92aef3bd9cb14686c7b586f9026a88a596a6640dfde584ef9b90285fd57260ec91389d724fc567ad1289363a2e76a9561d0f1444ea7f592c928e33d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibraryzx-calculus.code.tex \
tex-zx-calculus.sty \
texlive-zx-calculus"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
