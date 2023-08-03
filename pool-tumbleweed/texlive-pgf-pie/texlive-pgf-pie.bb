SUMMARY = "Draw pie charts, using PGF"
DESCRIPTION = "The package provides the means to draw pie (and variant) \
charts, using PGF/TikZ."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.7svn63603"

RPM_NAME = "texlive-pgf-pie-2023.209.0.0.7svn63603-52.1.noarch.rpm"
RPM_HASH = "003a1c1cd8141abaff1b735ab5da0fdd05abc8913c418a9fa6f1d7d1b4471ca3f5e5db480ebe3781dae2a95afb68f2a4235f00074e9541f66f4ae1028eb2d3c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgf-pie.sty \
tex-tikzlibrarypie.code.tex \
texlive-pgf-pie"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-carlisle \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-latex \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
