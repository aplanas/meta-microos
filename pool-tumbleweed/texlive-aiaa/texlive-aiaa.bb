SUMMARY = "Typeset AIAA conference papers"
DESCRIPTION = "A bundle of LaTeX/BibTeX files and sample documents to aid \
those producing papers and journal articles according to the \
guidelines of the American Institute of Aeronautics and \
Astronautics (AIAA)."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.6svn15878"

RPM_NAME = "texlive-aiaa-2023.209.3.6svn15878-55.1.noarch.rpm"
RPM_HASH = "3fdeb0eb0a02e33c3aa887ea70aee32ef1ae51ebc873384d53369456123efcb225b9e70ca2fc80d018b8b1fd304c295d305a0434faaa1542aa9f41550f6006f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aiaa-tc.cls \
texlive-aiaa"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-article.cls \
tex-fancyhdr.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-lastpage.sty \
tex-overcite.sty \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
