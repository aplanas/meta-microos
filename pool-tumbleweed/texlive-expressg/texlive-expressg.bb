SUMMARY = "Diagrams consisting of boxes, lines, and annotations"
DESCRIPTION = "A MetaPost package providing facilities to assist in drawing \
diagrams that consist of boxes, lines, and annotations. \
Particular support is provided for creating EXPRESS-G diagrams, \
for example IDEF1X, OMT, Shlaer-Mellor, and NIAM diagrams. The \
package may also be used to create UML and most other \
Box-Line-Annotation charts, but not Gantt charts directly."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn29349"

RPM_NAME = "texlive-expressg-2023.209.1.5svn29349-53.1.noarch.rpm"
RPM_HASH = "1be1afefcb6ec63d3258acef4f44c972a2022f55d571e4b5ba18f7802a7f8115487fab18ceff5cbefce031141f2e1f4044bbe0c47ebf5ca5814de7fdd49a7083"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-expressg"

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
