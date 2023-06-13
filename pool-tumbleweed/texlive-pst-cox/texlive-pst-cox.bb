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

PV = "2023.201.0.0.98_betasvn15878"

RPM_NAME = "texlive-pst-cox-2023.201.0.0.98_betasvn15878-52.1.noarch.rpm"
RPM_HASH = "97edebdf61f432a86eda14d3cb4bdb185f18dc17a1b7466dc64e47e29e4852e34063c51d7513dad72b0d72457ec7044cecc2121833528244b3380bec05ce112a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-coxcoor.sty) \
tex(pst-coxcoor.tex) \
tex(pst-coxeterp.sty) \
tex(pst-coxeterp.tex) \
texlive-pst-cox"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
