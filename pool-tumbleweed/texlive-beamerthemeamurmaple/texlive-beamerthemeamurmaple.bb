SUMMARY = "A new modern beamer theme"
DESCRIPTION = "This Beamer theme is a suitable theme for my use of Beamer in \
applied mathematics research. It meets my needs in my work. \
However, if you like this theme, and if you want to ask for or \
make improvements, don't hesitate to write to me!"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn65698"

RPM_NAME = "texlive-beamerthemeamurmaple-2023.201.1.2svn65698-53.1.noarch.rpm"
RPM_HASH = "8158b6d81136ede1fe718317931d0568467bd738394f7f5dee162c45092bee0a25fe0fe952fa2a3391828a7b6d1f6a6cf28cc3e3f92cecc78489abb394f0de5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(beamerthemeAmurmaple.sty) \
texlive-beamerthemeamurmaple"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
tex(iftex.sty) \
tex(luamesh.sty) \
tex(multicol.sty) \
tex(pgfpages.sty) \
tex(tcolorbox.sty) \
tex(xfp.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
