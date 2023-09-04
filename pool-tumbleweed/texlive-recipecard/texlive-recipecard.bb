SUMMARY = "Typeset recipes in note-card-sized boxes"
DESCRIPTION = "The recipecard class typesets recipes into note card sized \
boxes that can then be cut out and pasted on to note cards. The \
recipe then looks elegant and fits in the box of recipes."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn15878"

RPM_NAME = "texlive-recipecard-2023.209.2.0svn15878-54.2.noarch.rpm"
RPM_HASH = "a51211c7dbfb105aeae8972c038c05fb66afdd67d19c139f556f35db57fffc587c7a7bc54d1b2ef8c35b2e13c9d75a392ed85a7e9c2ac2b142f96e7d89b56c06"
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
