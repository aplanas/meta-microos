SUMMARY = "TikZ powered LaTeX package to draw parameterized 2D robot arms"
DESCRIPTION = "This LaTeX package uses TikZ to draw parameterized 2D robot \
arms, for example to be used in educational material."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn63116"

RPM_NAME = "texlive-robotarm-2023.209.0.0.1svn63116-54.2.noarch.rpm"
RPM_HASH = "d50722912ebbe691e8568997b0152354e6b2d1d7fd2f3d3a2e29c2b3a300c611ac9c706dce3ba2cf61ea7bad476c6d9549f01e498cee9e5e32c846992f2140fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-robotarm.sty \
texlive-robotarm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
