SUMMARY = "Draw continuous or discrete spectra using PGF/TikZ"
DESCRIPTION = "The purpose of this package is to draw the spectra of elements \
in a simple way. It is based on the package pst-spectra, but \
with some extra options. It relies on PGF/TikZ for drawing the \
desired spectrum, continuous or discrete. There are data \
available for the spectra of 98 elements and their ions (from \
the NASA database and from NIST). It also allows the user to \
draw spectra using their own data."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2.0svn66011"

RPM_NAME = "texlive-pgf-spectra-2023.209.2.2.0svn66011-52.1.noarch.rpm"
RPM_HASH = "e1b63f7e7c64470c0f98dfc423aa3332df5fed8faf1eac910130b8827a2234369bd3c30e0fabf832f212f4c4a941784d77baa03d2dbafb625ae5bcf8d07682a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgf-spectra.sty \
tex-spectra.data.LSE.tex \
tex-spectra.data.NIST.tex \
texlive-pgf-spectra"

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
