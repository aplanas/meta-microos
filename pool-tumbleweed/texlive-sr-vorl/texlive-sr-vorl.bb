SUMMARY = "Class for Springer books"
DESCRIPTION = "This package provides a LaTeX class and templates for books to \
be published at Springer Gabler Research, Springer Vieweg \
Research, Springer Spektrum Research, Springer VS Research, or \
Springer VS Forschung. It may be used to produce monographs in \
different formats and 'several-authors-books' fitting the \
conditions of the aforementioned publishers."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn59333"

RPM_NAME = "texlive-sr-vorl-2023.201.1.2svn59333-57.1.noarch.rpm"
RPM_HASH = "70bda2b0d51dfbbda272c1fb705c8ac9bd996629acde06dd36bdb09e534fc640815b0414150fcf50948e21c802ac3dd1d4cb7b1e470ee130c55ef66cf62b9818"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(sr-vorl.cls) \
texlive-sr-vorl"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(babel.sty) \
tex(caption.sty) \
tex(chngcntr.sty) \
tex(enumitem.sty) \
tex(etoolbox.sty) \
tex(geometry.sty) \
tex(mathptmx.sty) \
tex(microtype.sty) \
tex(onlyamsmath.sty) \
tex(ragged2e.sty) \
tex(scrlayer-scrpage.sty) \
tex(varwidth.sty) \
tex(xkeyval.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
