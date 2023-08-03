SUMMARY = "Citation style for literary studies at the University of Wuppertal"
DESCRIPTION = "The package defines a BibLaTeX citation style based on the \
author-title style of biblatex-dw. The citations are optimised \
for literary studies in faculty of humanities at the Bergische \
Universitat Wuppertal."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn31541"

RPM_NAME = "texlive-uni-wtal-ger-2023.209.0.0.2svn31541-54.1.noarch.rpm"
RPM_HASH = "6753aafe350523f5d84fe1b24c7e5afc4566980c7c3834d62740d8610751d39b5cc4f2bc890b2cd174ae75853ebeca6e318520607bf14a49ad769579ef441fb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uni-wtal-ger.bbx \
tex-uni-wtal-ger.cbx \
texlive-uni-wtal-ger"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authortitle-dw.bbx \
tex-authortitle-dw.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
