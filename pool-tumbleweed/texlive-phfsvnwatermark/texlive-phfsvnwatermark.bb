SUMMARY = "Watermarks with version control information from SVN"
DESCRIPTION = "This package allows you to add version control information as a \
gray watermark on each page of your document. The SVN info is \
read from keyword tags such as $Id$, $Date$, and $Author$ via \
the svn or svn-multi packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn41870"

RPM_NAME = "texlive-phfsvnwatermark-2023.209.1.0svn41870-52.1.noarch.rpm"
RPM_HASH = "d094d7e4fc9258479adaa80cfcb6334a530f7382d3610402604ed637909eeb6c13c277ffd400784e38abb4bcfdf240d24016da5b55c3d3163678990df7a51154"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-phfsvnwatermark.sty \
texlive-phfsvnwatermark"

RDEPENDS:${PN} += "/usr/bin/sh \
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
