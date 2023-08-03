SUMMARY = "LaTeX class for articles submitted to the CSTUG Bulletin (Zpravodaj)"
DESCRIPTION = "The package provides the class for articles for the CSTUG \
Bulletin (Zpravodaj Ceskoslovenskeho sdruzeni uzivatelu TeXu). \
You can see the structure of a document by looking at the \
source file of the manual."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65250"

RPM_NAME = "texlive-csbulletin-2023.209.svn65250-55.1.noarch.rpm"
RPM_HASH = "045e0943f886098f0282330f861eebf2481af971f7616801dc8d2ce2b17211020ec17a0210e885ae5e80187c862076e6f15487b1adea7d07b4e68d1d422607e8"
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
