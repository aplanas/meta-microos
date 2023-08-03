SUMMARY = "Add bibliography/index/contents to Table of Contents"
DESCRIPTION = "Automatically adds the bibliography and/or the index and/or the \
contents, etc., to the Table of Contents listing."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5ksvn20085"

RPM_NAME = "texlive-tocbibind-2023.209.1.5ksvn20085-53.1.noarch.rpm"
RPM_HASH = "1abe97aff13c8e7acdecb401b0f033522e81afc502fc53eacaacf86c09e5521f50c8acf6441be2df57bfeac1b87d1e8a97b5270bd3f181e2253224c1829c2b32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tocbibind.sty \
texlive-tocbibind"

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
