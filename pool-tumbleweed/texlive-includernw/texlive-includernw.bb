SUMMARY = "Include .Rnw inside .tex"
DESCRIPTION = "This package is for including .Rnw (knitr/sweave)-files inside \
.tex-files. It requires that you have R and the R-package knitr \
installed. Note: This package will probably not work on \
Windows. It is tested only on OS X, and will probably also work \
on standard Linux distros."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1.0svn47557"

RPM_NAME = "texlive-includernw-2023.208.0.0.1.0svn47557-53.1.noarch.rpm"
RPM_HASH = "c70401f9d584025037f5d50d32372d0631ab2764b1c9b95dcc88c0a29a79637263ba8562d90ccd8d9649d5524dfaf52f8582b155f736b9158f07d0532186ec62"
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
