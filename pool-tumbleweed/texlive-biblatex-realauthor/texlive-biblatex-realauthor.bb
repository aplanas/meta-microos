SUMMARY = "Indicate the real author of a work"
DESCRIPTION = "This package allows to use a new field 'realauthor', which \
indicates the real author of a work, when published in a \
pseudepigraphic name."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.7.1asvn45865"

RPM_NAME = "texlive-biblatex-realauthor-2023.201.2.7.1asvn45865-53.1.noarch.rpm"
RPM_HASH = "391b293c85e262e81385d6fbe9900d9b30f5b3eb649a151900285462f14ccf9a90a3f30a649a1d49a9f59b13b8af86f87b3886b1229fad1433d240979f844cb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-realauthor.bbx \
texlive-biblatex-realauthor"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
