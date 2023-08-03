SUMMARY = "The colour palette of The University of Western Australia"
DESCRIPTION = "This package uses the xcolor package to define macros for the \
colour palette of The University of Western Australia."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn60443"

RPM_NAME = "texlive-uwa-colours-2023.209.1.0.0svn60443-54.1.noarch.rpm"
RPM_HASH = "332544e9d1da3281685106a668d9b35fb95a8a89c1e5864eb54d23f73e018f01f03fe6640f57824ceed2cc3a2c026cc6b5641cd13ceaaf7d1f688e3337cae347"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uwa-colours.sty \
texlive-uwa-colours"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
