SUMMARY = "Manages subseries with BibLaTeX"
DESCRIPTION = "Some publishers organize book series with subseries. In this \
case, two numbers are associated with one volume: the number \
inside the series and the number inside the subseries. That is \
the case of the series Corpus Scriptorium Christianorum \
Orientalium published by Peeters. This package provides new \
fields to manage such system."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.0svn43330"

RPM_NAME = "texlive-biblatex-subseries-2023.209.1.2.0svn43330-54.1.noarch.rpm"
RPM_HASH = "dc70561a2dd3944969e3f11e03e82ef58f8e1cfaf3b68fa205273ffe8bf910139314565490b86ed7b5aded72495ad41f36d8c70a2bba3ac22be1085ade8dac7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-subseries.bbx \
texlive-biblatex-subseries"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
