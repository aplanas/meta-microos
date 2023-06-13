SUMMARY = "A clean LaTeX style for thesis documents"
DESCRIPTION = "The package offers a clean, simple, and elegant LaTeX style for \
thesis documents."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4.0svn51472"

RPM_NAME = "texlive-cleanthesis-2023.201.0.0.4.0svn51472-53.1.noarch.rpm"
RPM_HASH = "5d323a7e3ed3bd3e40a1bf1be803e18530811f76a414be2d8d4482925be7a550b007db86905e2295374386435b83e8d75ced0bc857a17c748712695b94bf08cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cleanthesis.sty) \
texlive-cleanthesis"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(blindtext.sty) \
tex(charter.sty) \
tex(enumitem.sty) \
tex(fontenc.sty) \
tex(graphicx.sty) \
tex(hyperref.sty) \
tex(listings.sty) \
tex(lmodern.sty) \
tex(microtype.sty) \
tex(scrlayer-scrpage.sty) \
tex(setspace.sty) \
tex(tabularx.sty) \
tex(textcomp.sty) \
tex(tgheros.sty) \
tex(tocloft.sty) \
tex(xcolor.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
