SUMMARY = "To retain the original caption names when using Babel"
DESCRIPTION = "This package forces the caption names (\\chaptername, \\today, \
etc) declared by the document class in use to be used as the \
caption names for a specific language introduced by the Babel \
package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn64072"

RPM_NAME = "texlive-bxorigcapt-2023.209.1.0svn64072-53.1.noarch.rpm"
RPM_HASH = "725c19eb0604ea74b21e85e8e0091ffd663968061fa7c5812e0e16844cd0d06ba0765588f158725fa9fc69546d8a8c5eae5ee066b409b1f886f79478dd49afbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxorigcapt.sty \
texlive-bxorigcapt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
