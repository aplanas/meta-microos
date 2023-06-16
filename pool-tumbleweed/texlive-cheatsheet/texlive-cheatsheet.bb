SUMMARY = "A simple cheatsheet class"
DESCRIPTION = "The package provides a clean, multi-column design intended for \
cheat sheets. It imports the most useful packages and encloses \
the document in a multicol environment."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8svn45069"

RPM_NAME = "texlive-cheatsheet-2023.201.0.0.8svn45069-53.1.noarch.rpm"
RPM_HASH = "599409d9fc8f0dcb4671600e1b7d0ec92e40b03e29619bd86e26f3f9af9d9047015910c8e52b570fc50f30514ee60fb5c34a20816ff95ec766838fc5ac2b12fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cheatsheet.cls \
texlive-cheatsheet"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-article.cls \
tex-csquotes.sty \
tex-etoolbox.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-kvoptions.sty \
tex-libertine.sty \
tex-listings.sty \
tex-mdframed.sty \
tex-multicol.sty \
tex-suffix.sty \
tex-xcolor.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
