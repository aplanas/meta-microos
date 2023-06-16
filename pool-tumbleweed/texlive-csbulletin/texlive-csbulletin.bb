SUMMARY = "LaTeX class for articles submitted to the CSTUG Bulletin (Zpravodaj)"
DESCRIPTION = "The package provides the class for articles for the CSTUG \
Bulletin (Zpravodaj Ceskoslovenskeho sdruzeni uzivatelu TeXu). \
You can see the structure of a document by looking at the \
source file of the manual."
LICENSE = "LPPL-1.0"

PV = "2023.204.svn65250"

RPM_NAME = "texlive-csbulletin-2023.204.svn65250-54.1.noarch.rpm"
RPM_HASH = "a248c734fa218f0f15688783766d978617746160947f9f13dbb6d71cb3370ffe1afe6f33612f52c78d04904f3dfbc227dc712f58cabd2ded231fee777a32e4d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-csbulacronym.sty \
tex-csbulletin.cls \
tex-csbulobalka.cls \
tex-csbulobalka.sty \
tex-csbulv1.cls \
texlive-csbulletin"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-article.cls \
tex-babel.sty \
tex-color.sty \
tex-fancyvrb.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-lmodern.sty \
tex-mflogo.sty \
tex-verbatim.sty \
tex-zwpagelayout.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
