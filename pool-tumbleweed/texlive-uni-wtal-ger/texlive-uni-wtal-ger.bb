SUMMARY = "Citation style for literary studies at the University of Wuppertal"
DESCRIPTION = "The package defines a BibLaTeX citation style based on the \
author-title style of biblatex-dw. The citations are optimised \
for literary studies in faculty of humanities at the Bergische \
Universitat Wuppertal."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn31541"

RPM_NAME = "texlive-uni-wtal-ger-2023.201.0.0.2svn31541-53.1.noarch.rpm"
RPM_HASH = "2b0e307182accf1d483c75f4c78318efd7fbd2741b9a56ac2351bc13ce4b73114ddd08822f19dc01422fae68d2a855afa571d3c819c6ed3d44491dfeac83077f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uni-wtal-ger.bbx \
tex-uni-wtal-ger.cbx \
texlive-uni-wtal-ger"

RDEPENDS:${PN} += "/bin/sh \
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
