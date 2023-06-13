SUMMARY = "A LaTeX class for building legislation files for UMBC Student Government Association Bills"
DESCRIPTION = "LaTeX class for building legislation files for UMBC Student \
Government Association Bills. Requires pdflatex and the \
mdframed enumitem, lineno, and xifthen packages."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2016_6_8svn41348"

RPM_NAME = "texlive-umbclegislation-2023.201.2016_6_8svn41348-53.1.noarch.rpm"
RPM_HASH = "74bfe37ff7f519eb4faf2e518e461d085bee9018cae5fa2cbce085a448d9cd6944a673c91a994839cab3e239ecb5e3a9d8e7cf962ad3060d2556ed2bfcd343f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(legislation.cls) \
texlive-umbclegislation"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(article.cls) \
tex(draftwatermark.sty) \
tex(enumitem.sty) \
tex(etoolbox.sty) \
tex(geometry.sty) \
tex(lineno.sty) \
tex(mdframed.sty) \
tex(xifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
