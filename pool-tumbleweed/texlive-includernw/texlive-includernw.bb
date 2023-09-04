SUMMARY = "Include .Rnw inside .tex"
DESCRIPTION = "This package is for including .Rnw (knitr/sweave)-files inside \
.tex-files. It requires that you have R and the R-package knitr \
installed. Note: This package will probably not work on \
Windows. It is tested only on OS X, and will probably also work \
on standard Linux distros."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.0svn47557"

RPM_NAME = "texlive-includernw-2023.209.0.0.1.0svn47557-54.1.noarch.rpm"
RPM_HASH = "bb4e810106e5539da759ac2214f6172bfa154c53008d9985b781e8778becebff967ce6463495929e47c541ec3fed536d28523024c6b0dad03fe4abb5b592e4c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-includeRnw.sty \
texlive-includernw"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-pdftexcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
