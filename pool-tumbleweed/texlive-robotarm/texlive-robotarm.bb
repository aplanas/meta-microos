SUMMARY = "TikZ powered LaTeX package to draw parameterized 2D robot arms"
DESCRIPTION = "This LaTeX package uses TikZ to draw parameterized 2D robot \
arms, for example to be used in educational material."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn63116"

RPM_NAME = "texlive-robotarm-2023.201.0.0.1svn63116-53.2.noarch.rpm"
RPM_HASH = "ceb66d6dc8713f390aed1862e7477cb525a4211c72470273fb488d3faf4352d6f87bece0cfa81d809f8d225f2846c4cc93e5a77f5121333d5bc70aff3b124fd0"
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
