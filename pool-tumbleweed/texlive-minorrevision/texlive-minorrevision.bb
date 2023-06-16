SUMMARY = "Quote and refer to a manuscript for minor revisions"
DESCRIPTION = "The package supports those who publish articles in \
peer-reviewed journals. In the final stages of the review \
process, the authors typically have to provide an additional \
document (such as a letter to the editors), in which they \
provide a list of modifications that they made to the \
manuscript. The package automatically provides line numbers and \
quotations from the manuscript, for this letter. The package \
loads the package lineno, so (in effect) shares lineno's \
incompatibilities."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn32165"

RPM_NAME = "texlive-minorrevision-2023.201.1.1svn32165-54.1.noarch.rpm"
RPM_HASH = "21cce3c5f13095e6fbaa9ee465356989dd898f8ee0685ebc153c4c9ab94e0e7df0c8bf1ed9354d1f89827fc741a7eb71da53feac82816931a91e40be35190fa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-minorrevision.sty \
texlive-minorrevision"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-lineno.sty \
tex-xkeyval.sty \
tex-xr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
