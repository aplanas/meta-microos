SUMMARY = "Create custom periodic tables of elements"
DESCRIPTION = "The purpose of this package is to provide the Periodic Table of \
Elements in a simple way. It relies on PGF/TikZ to offer a full \
or partial periodic table with a variety of options and \
displaying the desired data for all the 118 elements. It can be \
done in six languages: English, French, German, Portuguese \
(from Portugal and from Brazil), Spanish and Italian. \
Compatible with pdfLaTeX, LuaLaTeX and XeLaTeX engines."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.0svn66010"

RPM_NAME = "texlive-pgf-periodictable-2023.209.2.0.0svn66010-52.1.noarch.rpm"
RPM_HASH = "9a83587b249e7d85ca0782fa604df21ee02ff60aabde6cc0c182aaaab7ea618ebb9b13652d3f0efaacb420e4f56c2d68d6f16c12901de1959ffadb7f7775832f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgf-PeriodicTable.sty \
tex-pgfPT.backcolors.keys.tex \
tex-pgfPT.buildcell.tex \
tex-pgfPT.coordinates.tex \
tex-pgfPT.data.tex \
tex-pgfPT.drawing.keys.tex \
tex-pgfPT.formatNumbers.tex \
tex-pgfPT.input.library.tex \
tex-pgfPT.labels.tex \
tex-pgfPT.names.tex \
tex-pgfPT.process.language.tex \
texlive-pgf-periodictable"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontenc.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
