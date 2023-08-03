SUMMARY = "Support DVI pos: specials used by ConTeXt DVI output"
DESCRIPTION = "The dvipos package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66186"

RPM_NAME = "texlive-dvipos-2023.209.svn66186-54.1.noarch.rpm"
RPM_HASH = "b24173225b52674f0a4418ef6557445ed1caaea6c9c753e4242170242b8317fd5192a8644e887358b09c6d8e45b117c069799647356788dacd8fb85dc320140f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dvipos.1 \
texlive-dvipos"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-dvipos-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
