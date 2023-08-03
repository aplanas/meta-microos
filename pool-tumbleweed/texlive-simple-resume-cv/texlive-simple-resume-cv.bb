SUMMARY = "Template for a simple resume or curriculum vitae (CV), in XeLaTeX"
DESCRIPTION = "Template for a simple resume or curriculum vitae (CV), in \
XeLaTeX. Simple template that can be further customized or \
extended, with numerous examples."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn43057"

RPM_NAME = "texlive-simple-resume-cv-2023.209.svn43057-54.1.noarch.rpm"
RPM_HASH = "50e737d15509cb1bf79ad2eeb8a94080114823008a69d2b930d3795709af2b90b655004f4360a67e876170b06db9e87782075431df1e870910d7c9c1354126ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-simpleresumecv.cls \
texlive-simple-resume-cv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-color.sty \
tex-datetime2.sty \
tex-fontspec.sty \
tex-hyperref.sty \
tex-hyphenat.sty \
tex-xltxtra.sty \
tex-xunicode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
