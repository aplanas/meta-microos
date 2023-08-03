SUMMARY = "Horizontal and columned lists"
DESCRIPTION = "This plain TeX and LaTeX package provides the 'hlist' \
environment in which \\hitem starts a horizontal and columned \
item. It depends upon the simplekv package."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.11svn44983"

RPM_NAME = "texlive-hlist-2023.209.0.0.11svn44983-54.1.noarch.rpm"
RPM_HASH = "39f493018b3f3aae7c9f2648ad0e022a83c6b59d6b86055a3294c6bd7fff798d79e28a8c22bb377212f767f75f72b1bd5cefabf767832e76bc8102c1eb8c35d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hlist.sty \
tex-hlist.tex \
texlive-hlist"

RDEPENDS:${PN} += "/usr/bin/sh \
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
