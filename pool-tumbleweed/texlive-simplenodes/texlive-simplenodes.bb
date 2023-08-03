SUMMARY = "Simple nodes in four colors written in TikZ for LaTeX"
DESCRIPTION = "This is a LaTeX macro package for generating simple node-based \
flow graphs or diagrams built upon the TikZ package. The \
package provides two basic commands, one to generate a node and \
one to create links between nodes. The positioning of the nodes \
is not handled by the package itself but is preferably done in \
a tabular environment. In total, four simple node types are \
defined, loosely based on the nomenclature and color patterns \
of the popular Java script Bootstrap."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn62888"

RPM_NAME = "texlive-simplenodes-2023.209.svn62888-54.1.noarch.rpm"
RPM_HASH = "c516412aed5957256be199a9eecac3f7af0575e1e1a3babe7d223ca560d0a5ec9da17b7e63e9f2eac99d69870927ae57f7c1689d806b76082c729efe92da7329"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-simplenodes.sty \
texlive-simplenodes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-kvoptions.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
