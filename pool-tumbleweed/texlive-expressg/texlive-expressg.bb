SUMMARY = "Diagrams consisting of boxes, lines, and annotations"
DESCRIPTION = "A MetaPost package providing facilities to assist in drawing \
diagrams that consist of boxes, lines, and annotations. \
Particular support is provided for creating EXPRESS-G diagrams, \
for example IDEF1X, OMT, Shlaer-Mellor, and NIAM diagrams. The \
package may also be used to create UML and most other \
Box-Line-Annotation charts, but not Gantt charts directly."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn29349"

RPM_NAME = "texlive-expressg-2023.201.1.5svn29349-52.1.noarch.rpm"
RPM_HASH = "377529b34e3d93dd0370067236ff73e0831d8153c94267ffedbcf28ccc78e744e5bd79e865edb1f9f8c7e3e54155858e94feb9441841db588b76cb1d57417e56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-expressg"

RDEPENDS:${PN} += "/bin/sh \
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
