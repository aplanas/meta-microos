SUMMARY = "A LaTeX document class for the Journal of Electrical Bioimpedance"
DESCRIPTION = "A document class for writing articles to the Journal of \
Electrical Bioimpedance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn21758"

RPM_NAME = "texlive-elbioimp-2023.209.1.2svn21758-54.2.noarch.rpm"
RPM_HASH = "a56d2438bb56c03b9116c36a3e25c884fcc8896c91c1e8e9a45bb46ac5f5711265df93401edccbc53b9105b1ef8c5a23f495b1a367ebf3aafcd38c4ef09d8ca5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-elbioimp.cls \
texlive-elbioimp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-ifthen.sty \
tex-mathptmx.sty \
tex-type1cm.sty \
tex-type1ec.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
