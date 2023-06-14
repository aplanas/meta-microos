SUMMARY = "Tabular with variable width columns balanced"
DESCRIPTION = "The package defines a tabular*-like environment, tabulary, \
taking a 'total width' argument as well as the column \
specifications. The environment uses column types L, C, R and J \
for variable width columns (\\raggedright', \\centering, \
\\raggedleft, and normally justified). In contrast to tabularx's \
X columns, the width of each column is weighted according to \
the natural width of the widest cell in the column."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.10svn34368"

RPM_NAME = "texlive-tabulary-2023.201.0.0.10svn34368-54.1.noarch.rpm"
RPM_HASH = "95e6cfa17144f9460b4ded0e902e8f3c5310997fa20f5908468b4f8c805277a2983673dfd58b176ec91e9588cfa5d1cabe8f062676356b4253b50571f48b7e75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tabulary.sty \
texlive-tabulary"

RDEPENDS:${PN} += "/bin/sh \
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
