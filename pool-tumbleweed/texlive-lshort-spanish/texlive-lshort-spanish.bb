SUMMARY = "Short introduction to LaTeX, Spanish translation"
DESCRIPTION = "A Spanish translation of the Short Introduction to LaTeX2e, \
version 20."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn35050"

RPM_NAME = "texlive-lshort-spanish-2023.201.0.0.5svn35050-52.1.noarch.rpm"
RPM_HASH = "0900ac9ee5af24e968b758a59cc80985db4c60893f7dc819f789a189b15199bf7dd63318bdfc9e6e8bb3ec89b41969c7731da511bbe332547cc8576697b654d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-spanish"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
