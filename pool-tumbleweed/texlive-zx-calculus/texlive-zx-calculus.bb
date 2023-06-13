SUMMARY = "A library to typeset ZX Calculus diagrams"
DESCRIPTION = "This library (based on the great TikZ and TikZ-cd packages) \
allows you to typeset ZX-calculus directly in LaTeX. It comes \
with many pre-built wire shapes, a highly customizable node \
style (with multiple flavours for putting labels inside or \
outside nodes), and a 'debugging' mode to avoid getting lost in \
big diagrams."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn60838"

RPM_NAME = "texlive-zx-calculus-2023.201.svn60838-52.1.noarch.rpm"
RPM_HASH = "4131122baa0004f4c636214b1a21e6fa20852c39e8d98f66ba7ccdaab34f9f63e5b4972001232f88be1ca8b6649551128919c96e768f46e4aa69e1c9235bb4f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tikzlibraryzx-calculus.code.tex) \
tex(zx-calculus.sty) \
texlive-zx-calculus"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
