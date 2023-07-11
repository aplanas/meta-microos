SUMMARY = "A library to typeset ZX Calculus diagrams"
DESCRIPTION = "This library (based on the great TikZ and TikZ-cd packages) \
allows you to typeset ZX-calculus directly in LaTeX. It comes \
with many pre-built wire shapes, a highly customizable node \
style (with multiple flavours for putting labels inside or \
outside nodes), and a 'debugging' mode to avoid getting lost in \
big diagrams."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn60838"

RPM_NAME = "texlive-zx-calculus-2023.201.svn60838-52.2.noarch.rpm"
RPM_HASH = "f827724aad0c2ecae8334a5be91567b95fa3b115402f2ce88f8c6397355d00387092768d8da1e6dc44c8007b0d829f4517ec3488c5353dc5030152716d46bbfb"
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
