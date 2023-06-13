SUMMARY = "Relative section headings for modular documents"
DESCRIPTION = "LaTeX sections have absolute depth, e.g. \\section, \\subsection, \
etc. When composing modular documents, we want relative depths. \
The coseoul package provides relative headings, but does not \
get things right when composing a document modularly from \
multiple parts. This package provides the missing piece. \
modular relies on coseoul, import, and ifthen."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn44142"

RPM_NAME = "texlive-modular-2023.201.svn44142-54.1.noarch.rpm"
RPM_HASH = "a3ad9ec78f11ca6a83bbb2f1279ec019e72ad3da028c42bc252f537ca4740732b8f897e7359a5e475df90cc44ae29510ebdc53c7feeb9460f56e9e082cfc98e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(modular.sty) \
texlive-modular"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(coseoul.sty) \
tex(ifthen.sty) \
tex(import.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
