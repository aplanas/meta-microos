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

PV = "2023.201.svn62888"

RPM_NAME = "texlive-simplenodes-2023.201.svn62888-53.1.noarch.rpm"
RPM_HASH = "a9f292e3695b69e61495f74d65c4cb630c9e98871cbbaffb160d250447eaae975394f4d6c429d4decf0f4d04dc30fcf5309c0069d56552defe9cf3501341dde3"
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
