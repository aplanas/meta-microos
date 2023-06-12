SUMMARY = "Create custom periodic tables of elements"
DESCRIPTION = "The purpose of this package is to provide the Periodic Table of \
Elements in a simple way. It relies on PGF/TikZ to offer a full \
or partial periodic table with a variety of options and \
displaying the desired data for all the 118 elements. It can be \
done in six languages: English, French, German, Portuguese \
(from Portugal and from Brazil), Spanish and Italian. \
Compatible with pdfLaTeX, LuaLaTeX and XeLaTeX engines."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.0svn66010"

RPM_NAME = "texlive-pgf-periodictable-2023.201.2.0.0svn66010-51.1.noarch.rpm"
RPM_HASH = "72803db254b644ed46e5c928ccf7fc488ad42326a392f361b954e54a8d9ad55a2b119d1880581e739109eee8c9588a3f292d6324bd502af5ce0bcf913644d0a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pgf-PeriodicTable.sty) \
tex(pgfPT.backcolors.keys.tex) \
tex(pgfPT.buildcell.tex) \
tex(pgfPT.coordinates.tex) \
tex(pgfPT.data.tex) \
tex(pgfPT.drawing.keys.tex) \
tex(pgfPT.formatNumbers.tex) \
tex(pgfPT.input.library.tex) \
tex(pgfPT.labels.tex) \
tex(pgfPT.names.tex) \
tex(pgfPT.process.language.tex) \
texlive-pgf-periodictable"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fontenc.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
