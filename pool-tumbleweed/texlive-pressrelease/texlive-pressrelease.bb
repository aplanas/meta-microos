SUMMARY = "A class for typesetting press releases"
DESCRIPTION = "A configurable class for writing press releases."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35147"

RPM_NAME = "texlive-pressrelease-2023.209.1.0svn35147-53.1.noarch.rpm"
RPM_HASH = "fe5737249e3b679c8f661ebb579a0e2dd7dd4a25a01cc7437afcff6d1d24ec2131d3c69eaae40175ac869a0e255319661265b32748ce56cd43b334fa30688de7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pressrelease-symbols.sty \
tex-pressrelease.cls \
texlive-pressrelease"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-etoolbox.sty \
tex-geometry.sty \
tex-marvosym.sty \
tex-refcount.sty \
tex-setspace.sty \
tex-tikz.sty \
tex-url.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
