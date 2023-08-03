SUMMARY = "Indicate the real author of a work"
DESCRIPTION = "This package allows to use a new field 'realauthor', which \
indicates the real author of a work, when published in a \
pseudepigraphic name."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.7.1asvn45865"

RPM_NAME = "texlive-biblatex-realauthor-2023.209.2.7.1asvn45865-54.1.noarch.rpm"
RPM_HASH = "7bbd9203ad4aaa892164a7b09dfcb50b05311c36ae183cc672ab3610f13a7d6ee1a22c5583de31abbaea25bd060937ddf208f8d49ce6dadb8180d09b210ceb3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-realauthor.bbx \
texlive-biblatex-realauthor"

RDEPENDS:${PN} += "/usr/bin/sh \
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
