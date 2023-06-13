SUMMARY = "Typeset miller indices"
DESCRIPTION = "Typeset miller indices, e.g., <1-20>, that are used in material \
science with an easy syntax. Minus signs are printed as bar \
above the corresponding number."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn18789"

RPM_NAME = "texlive-miller-2023.201.1.2svn18789-54.1.noarch.rpm"
RPM_HASH = "218b4b7da77677aeb86f276c5c4557dfb6338f86166417f3347ed09f78787aabb8e9c25e2d25bb3f03748759482c40e9e0901bfe1415ff5ac85b8c1355b8bc68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(miller.sty) \
texlive-miller"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
