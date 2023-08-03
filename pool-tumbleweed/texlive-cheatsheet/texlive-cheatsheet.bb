SUMMARY = "A simple cheatsheet class"
DESCRIPTION = "The package provides a clean, multi-column design intended for \
cheat sheets. It imports the most useful packages and encloses \
the document in a multicol environment."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8svn45069"

RPM_NAME = "texlive-cheatsheet-2023.209.0.0.8svn45069-54.1.noarch.rpm"
RPM_HASH = "cdcc5e5f4058d06b146d37d17b9b5b6618d1cbae333f7444bd543dd669313da3dbfee338f6f0eb22a6710943dd2866ef0cbd44b086a0cf3b337f2443bf81bf3e"
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
