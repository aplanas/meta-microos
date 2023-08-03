SUMMARY = "Create bond graph figures in LaTeX documents"
DESCRIPTION = "The package draws bond graphs using PGF and TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn21670"

RPM_NAME = "texlive-bondgraph-2023.209.1.0svn21670-53.1.noarch.rpm"
RPM_HASH = "766890b6dddfca5d9ff1a4b824dd2164a4919c6a293d787c0d19bf971195d8b296f2e322699d9b1fcd8974dc7bb6cf5cb8e4e8d685f482903ccd90d50b870185"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bondgraph.sty \
texlive-bondgraph"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
