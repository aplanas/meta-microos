SUMMARY = "A LaTeX cheat sheet"
DESCRIPTION = "A LaTeX reference sheet for writing scientific papers. Unlike \
many other such sheets, this sheet does not focus on \
typesetting mathematics (though it does list some symbols)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.13svn15878"

RPM_NAME = "texlive-latexcheat-2023.201.1.13svn15878-54.1.noarch.rpm"
RPM_HASH = "f340fe6462f3954841d735b02799be3a0b4a2ba68cc1ec35e61cd0f8583e5b7e02dc7c788636775537b4d06e2887f8b5f2a87703b44e0820a75ad04cca7f6277"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexcheat"

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
