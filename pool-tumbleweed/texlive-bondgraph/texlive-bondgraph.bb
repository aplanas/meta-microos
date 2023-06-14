SUMMARY = "Create bond graph figures in LaTeX documents"
DESCRIPTION = "The package draws bond graphs using PGF and TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn21670"

RPM_NAME = "texlive-bondgraph-2023.201.1.0svn21670-52.1.noarch.rpm"
RPM_HASH = "d94929be1e083dbc6da55b598f8b7ddb5e08d77882222de878ff1e152a94aa8769d1ab14912b124988eea6c8033b4be3313755c6e6f19bc4871209bfda8a17ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bondgraph.sty \
texlive-bondgraph"

RDEPENDS:${PN} += "/bin/sh \
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
