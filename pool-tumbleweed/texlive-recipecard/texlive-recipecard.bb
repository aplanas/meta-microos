SUMMARY = "Typeset recipes in note-card-sized boxes"
DESCRIPTION = "The recipecard class typesets recipes into note card sized \
boxes that can then be cut out and pasted on to note cards. The \
recipe then looks elegant and fits in the box of recipes."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn15878"

RPM_NAME = "texlive-recipecard-2023.201.2.0svn15878-53.2.noarch.rpm"
RPM_HASH = "5bfb73fc2d35599b1fc5caca2adef06e5e53b014bc07078228365cc0eeabae41afbd99e229f754daf50864feffd0ca1e1d2af829f7b0dda945eb7fc84aa29294"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-recipecard.cls \
texlive-recipecard"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-boxedminipage.sty \
tex-calc.sty \
tex-geometry.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
