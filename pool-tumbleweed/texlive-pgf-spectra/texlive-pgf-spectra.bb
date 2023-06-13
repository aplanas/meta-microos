SUMMARY = "Draw continuous or discrete spectra using PGF/TikZ"
DESCRIPTION = "The purpose of this package is to draw the spectra of elements \
in a simple way. It is based on the package pst-spectra, but \
with some extra options. It relies on PGF/TikZ for drawing the \
desired spectrum, continuous or discrete. There are data \
available for the spectra of 98 elements and their ions (from \
the NASA database and from NIST). It also allows the user to \
draw spectra using their own data."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2.0svn66011"

RPM_NAME = "texlive-pgf-spectra-2023.201.2.2.0svn66011-51.1.noarch.rpm"
RPM_HASH = "f1311e615905e215397a0476d937d41aee1e6497b0f07deb87008e675a623ccfa0889248036a2f2b1780b447f745f32f87372233125dff5bddd648442e93c3b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pgf-spectra.sty) \
tex(spectra.data.LSE.tex) \
tex(spectra.data.NIST.tex) \
texlive-pgf-spectra"

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
