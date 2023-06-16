SUMMARY = "Typeset AIAA conference papers"
DESCRIPTION = "A bundle of LaTeX/BibTeX files and sample documents to aid \
those producing papers and journal articles according to the \
guidelines of the American Institute of Aeronautics and \
Astronautics (AIAA)."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.6svn15878"

RPM_NAME = "texlive-aiaa-2023.201.3.6svn15878-54.1.noarch.rpm"
RPM_HASH = "550b3103605f6335ac0c8daa90e493ec3c84d0a84c1ab87f611313606198aa49ff1269209bbf662a25640593ce27a09e22385f2fe97cf181760094e0ecee2688"
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
