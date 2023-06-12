SUMMARY = "Macros useful in preparing teaching material"
DESCRIPTION = "Several groups of macros cover different branches of \
mathematics."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9svn55859"

RPM_NAME = "texlive-pas-cours-2023.201.1.9svn55859-51.1.noarch.rpm"
RPM_HASH = "93b50ec719ef884616de8a4ec1b9bc70b7533ab511a34458ed320c0fcd3321b905c103f6e2bc95fc53e0b7efb549a04696f1fd3567867502aab3bd20ac9b0520"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(macro-calculs.tex) \
tex(macro-patrons.tex) \
tex(macro-solides.tex) \
tex(macro-styles.tex) \
tex(pas-cours.sty) \
texlive-pas-cours"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amssymb.sty) \
tex(auto-pst-pdf.sty) \
tex(enumitem.sty) \
tex(fancyvrb.sty) \
tex(ifplatform.sty) \
tex(numprint.sty) \
tex(pst-plot.sty) \
tex(tikz.sty) \
tex(xkeyval.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
