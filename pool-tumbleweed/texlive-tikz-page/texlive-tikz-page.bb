SUMMARY = "Small macro to help building nice and complex layout materials"
DESCRIPTION = "The package provides a small macro to help building nice and \
complex layout materials."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn42039"

RPM_NAME = "texlive-tikz-page-2023.201.1.0svn42039-52.1.noarch.rpm"
RPM_HASH = "d1e3a20895ca34547ce9c5c80589aed818f70952583d24fa6bdd9cfd0567093c429f44cf38c371c386492e65a6fe8346c40533c6b03129680a7bcf9ad95e9575"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tikz-page.sty) \
texlive-tikz-page"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(fancyhdr.sty) \
tex(graphicx.sty) \
tex(textpos.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
