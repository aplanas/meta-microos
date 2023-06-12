SUMMARY = "Typeset CD covers"
DESCRIPTION = "Normal usage will ordinarily require no more than a simple data \
file per cover; the package will make a full insert for a CD \
case (it copes with both normal and slim cases)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.4svn34452"

RPM_NAME = "texlive-cd-2023.201.1.4svn34452-52.1.noarch.rpm"
RPM_HASH = "0a56174fe70f37f76b23e999d1644ff6bf50d3e40b681d0be98b596e2cf5f3c7049740c57696c618e4e7a14532114693e1ba1564ceb5d49dda70626537059482"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cd.cls) \
texlive-cd"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(article.cls) \
tex(rotating.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
