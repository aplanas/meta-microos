SUMMARY = "Easily annotate math equations using TikZ"
DESCRIPTION = "This package provides commands that make it easy to highlight \
terms in equations and add annotation labels using TikZ. It \
should work with pdfLaTeX as well as LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.0svn65851"

RPM_NAME = "texlive-annotate-equations-2023.209.0.0.2.0svn65851-55.1.noarch.rpm"
RPM_HASH = "70a8ff77c39ee4a92924ab4313d6edae52f60308dfd4cafdcf15f6361a41c4b03375ca5c85ff36bc23d123c4c5744a0068211afb2cc7e562b91bccc98351d919"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-annotate-equations.sty \
texlive-annotate-equations"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-ifluatex.sty \
tex-luatex85.sty \
tex-pdftexcmds.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
