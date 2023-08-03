SUMMARY = "Drawing regular complex polytopes with PSTricks"
DESCRIPTION = "Pst-cox is a PSTricks package for drawing 2-dimensional \
projections of complex regular polytopes (after the work of \
Coxeter). The package consists of a macro library for drawing \
the projections. The complex polytopes appear in the study of \
the root systems and play a crucial role in many domains \
related to mathematics and physics. These polytopes have been \
completely described by Coxeter in his book 'Regular Complex \
Polytopes'. There exist only a finite numbers of exceptional \
regular complex polytopes (for example the icosahedron) and \
some infinite series (for example, one can construct a \
multi-dimensional analogue of the hypercube in any finite \
dimension). The library contains two packages. The first, \
pst-coxcoor, is devoted to the exceptional complex regular \
polytopes whose coordinates have been pre-computed. The second, \
pst-coxeterp, is devoted to the infinite series."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.0.0.98_betasvn15878"

RPM_NAME = "texlive-pst-cox-2023.209.0.0.98_betasvn15878-53.1.noarch.rpm"
RPM_HASH = "04c4d9ee7378762c735d5366d8024cb13dc6b809c403f75128b692f552b085304a454b619879b0030d3c5cf7c282ebd9a0590316b0456686c8bd9c3bbaa12ec7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-coxcoor.sty \
tex-pst-coxcoor.tex \
tex-pst-coxeterp.sty \
tex-pst-coxeterp.tex \
texlive-pst-cox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
