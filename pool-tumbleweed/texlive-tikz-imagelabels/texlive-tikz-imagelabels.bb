SUMMARY = "Put labels on images using TikZ"
DESCRIPTION = "This package allows to add label texts to an existing image \
with the aid of TikZ. This may be used to label certain \
features in an image."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn51490"

RPM_NAME = "texlive-tikz-imagelabels-2023.209.0.0.2svn51490-53.1.noarch.rpm"
RPM_HASH = "9dcbdaa0cba14096d10c431dbd20ce117de3fb5521c58293471f702d7f4a2aed974519a19e01f72f9f257995795754a2a6d05d564538b5b8feef7dd5e7c90a5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-imagelabels.sty \
texlive-tikz-imagelabels"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
