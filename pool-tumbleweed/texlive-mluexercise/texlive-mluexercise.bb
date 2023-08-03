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

PV = "2023.209.2.0svn56927"

RPM_NAME = "texlive-mluexercise-2023.209.2.0svn56927-55.1.noarch.rpm"
RPM_HASH = "ffc8f2c736e662ed4562afda74cc3e45d22f5206adca624df064c2ba78c5c8c6043e29ade40aead9d14a1f069cdc747ad3889ebf10318d616d8ec388894afb46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mluexercise.cls \
texlive-mluexercise"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-algorithm2e.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amstext.sty \
tex-amsthm.sty \
tex-array.sty \
tex-babel.sty \
tex-booktabs.sty \
tex-calc.sty \
tex-cancel.sty \
tex-csquotes.sty \
tex-etoolbox.sty \
tex-eulervm.sty \
tex-float.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-iflang.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-libertine.sty \
tex-listings.sty \
tex-listingsutf8.sty \
tex-microtype.sty \
tex-pgfkeys.sty \
tex-pgfplots.sty \
tex-relsize.sty \
tex-rotating.sty \
tex-scrartcl.cls \
tex-scrlayer-scrpage.sty \
tex-sourcecodepro.sty \
tex-subcaption.sty \
tex-tikz.sty \
tex-totpages.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
