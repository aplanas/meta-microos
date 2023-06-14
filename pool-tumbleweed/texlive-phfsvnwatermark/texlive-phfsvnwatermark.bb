SUMMARY = "Watermarks with version control information from SVN"
DESCRIPTION = "This package allows you to add version control information as a \
gray watermark on each page of your document. The SVN info is \
read from keyword tags such as $Id$, $Date$, and $Author$ via \
the svn or svn-multi packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn41870"

RPM_NAME = "texlive-phfsvnwatermark-2023.201.1.0svn41870-51.1.noarch.rpm"
RPM_HASH = "ac759cea7386cce0b588f14a37ad05719f246cdaadcebccac7538637af1de62be2fad5bc45dd3a3f4eebaf43fa1c9f6850831dfad5a6d07fe21565a2d1feba23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-phfsvnwatermark.sty \
texlive-phfsvnwatermark"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-currfile.sty \
tex-eso-pic.sty \
tex-kvoptions.sty \
tex-svn-multi.sty \
tex-svn.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
