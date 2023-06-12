SUMMARY = "Exercises/homework at the Martin Luther University Halle-Wittenberg"
DESCRIPTION = "This package provides a template class for solving weekly \
exercises at the Institute for Computer Science of Martin \
Luther University Halle-Wittenberg. The class can be used by \
all students--especially first semesters--to typeset their \
exercises with low effort in beautiful LaTeX. A bunch of handy \
macros are included that are used throughout many lectures \
during the bachelor's degree program. The class is maintained \
by the students' council of the university. The focus is on \
encouraging first semester students to use LaTeX for \
typesetting, thus the package has been kept as simple as \
possible."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn56927"

RPM_NAME = "texlive-mluexercise-2023.201.2.0svn56927-54.1.noarch.rpm"
RPM_HASH = "414448b5c9b3ee5b57777de540c9f6766f955f5d0408fc7500b29dda1e20bb53226ad12f9140ca903aded3af4cf8befac03835aa853ceb26c6ad0c76d1e32c5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mluexercise.cls) \
texlive-mluexercise"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(algorithm2e.sty) \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(amstext.sty) \
tex(amsthm.sty) \
tex(array.sty) \
tex(babel.sty) \
tex(booktabs.sty) \
tex(calc.sty) \
tex(cancel.sty) \
tex(csquotes.sty) \
tex(etoolbox.sty) \
tex(eulervm.sty) \
tex(float.sty) \
tex(fontenc.sty) \
tex(graphicx.sty) \
tex(hyperref.sty) \
tex(iflang.sty) \
tex(ifthen.sty) \
tex(inputenc.sty) \
tex(libertine.sty) \
tex(listings.sty) \
tex(listingsutf8.sty) \
tex(microtype.sty) \
tex(pgfkeys.sty) \
tex(pgfplots.sty) \
tex(relsize.sty) \
tex(rotating.sty) \
tex(scrartcl.cls) \
tex(scrlayer-scrpage.sty) \
tex(sourcecodepro.sty) \
tex(subcaption.sty) \
tex(tikz.sty) \
tex(totpages.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
