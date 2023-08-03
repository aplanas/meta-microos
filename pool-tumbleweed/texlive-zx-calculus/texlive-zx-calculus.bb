SUMMARY = "A library to typeset ZX Calculus diagrams"
DESCRIPTION = "This library (based on the great TikZ and TikZ-cd packages) \
allows you to typeset ZX-calculus directly in LaTeX. It comes \
with many pre-built wire shapes, a highly customizable node \
style (with multiple flavours for putting labels inside or \
outside nodes), and a 'debugging' mode to avoid getting lost in \
big diagrams."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn60838"

RPM_NAME = "texlive-zx-calculus-2023.209.svn60838-53.1.noarch.rpm"
RPM_HASH = "8aea563c3e2b54be5e5689e92248cfc89d9e8b94a30eb3743e99482630086c06ceba2031adadb018143221de3fc678c109eb64db6790a66640d4911f388fa971"
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
