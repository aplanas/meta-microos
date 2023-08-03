SUMMARY = "A LaTeX cheat sheet"
DESCRIPTION = "A LaTeX reference sheet for writing scientific papers. Unlike \
many other such sheets, this sheet does not focus on \
typesetting mathematics (though it does list some symbols)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.13svn15878"

RPM_NAME = "texlive-latexcheat-2023.209.1.13svn15878-55.1.noarch.rpm"
RPM_HASH = "dcd28c091d208500772b2d472ceaec9892d283da808c4f2df1b8bd5e5e5c7608630f6dfa658d857346d6384c334835e033a557b35b75af7e4fae86611ece0ac4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexcheat"

RDEPENDS:${PN} += "/usr/bin/sh \
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
