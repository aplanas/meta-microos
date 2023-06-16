SUMMARY = "A class for typesetting press releases"
DESCRIPTION = "A configurable class for writing press releases."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35147"

RPM_NAME = "texlive-pressrelease-2023.201.1.0svn35147-52.1.noarch.rpm"
RPM_HASH = "7d104418c69012be8ae13f3be70f764453c301bb1a9f4f541334e55a94e3a1262718dbb61887a7599af57fc81f9de75a48d8fb1126e6be6ba889d37ebdffdaf4"
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
