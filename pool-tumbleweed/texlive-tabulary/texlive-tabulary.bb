SUMMARY = "Tabular with variable width columns balanced"
DESCRIPTION = "The package defines a tabular*-like environment, tabulary, \
taking a 'total width' argument as well as the column \
specifications. The environment uses column types L, C, R and J \
for variable width columns (\\raggedright', \\centering, \
\\raggedleft, and normally justified). In contrast to tabularx's \
X columns, the width of each column is weighted according to \
the natural width of the widest cell in the column."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.10svn34368"

RPM_NAME = "texlive-tabulary-2023.209.0.0.10svn34368-55.1.noarch.rpm"
RPM_HASH = "a33f93064cc4a5fed170ecd4545017212cadc70b1ed48d3e8bd0f7ccdd7a18d3757ca307160d73d30161b01df95d22d0a1f4a4db01d63514edfb4d2cad554fdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tabulary.sty \
texlive-tabulary"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
