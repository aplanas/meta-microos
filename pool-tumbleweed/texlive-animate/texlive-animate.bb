SUMMARY = "Create PDF and SVG animations from graphics files and inline graphics"
DESCRIPTION = "The package provides an interface to create portable, \
JavaScript driven PDF and SVG animations from sets of graphics \
files or from inline graphics, such as LaTeX picture \
environment, PSTricks or pgf/TikZ generated pictures, or just \
from typeset text."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64401"

RPM_NAME = "texlive-animate-2023.201.svn64401-54.1.noarch.rpm"
RPM_HASH = "35e326a895cffc1017a528e733e1cf0ee90efdb1c3958bd6220dbb50b0cbfc356eb40bb669bb13480c9002cc821c204df6e050320ef4ec79cba46a460cf61548"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(animate.sty) \
texlive-animate"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(graphics.sty) \
tex(ifdraft.sty) \
tex(iftex.sty) \
tex(ifthen.sty) \
tex(ocgbase.sty) \
tex(pdfbase.sty) \
tex(zref-abspage.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
