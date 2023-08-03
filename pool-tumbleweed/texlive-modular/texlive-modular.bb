SUMMARY = "Relative section headings for modular documents"
DESCRIPTION = "LaTeX sections have absolute depth, e.g. \\section, \\subsection, \
etc. When composing modular documents, we want relative depths. \
The coseoul package provides relative headings, but does not \
get things right when composing a document modularly from \
multiple parts. This package provides the missing piece. \
modular relies on coseoul, import, and ifthen."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn44142"

RPM_NAME = "texlive-modular-2023.209.svn44142-55.1.noarch.rpm"
RPM_HASH = "9af460cbb87fd2f05c7cf568b5c5a48ba5b56a712e74530c7d3a4848a468673fbea4abb90948b8577145d565a7e25eca923eebaf8d1ced886338b72bf96009ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-modular.sty \
texlive-modular"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-coseoul.sty \
tex-ifthen.sty \
tex-import.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
