SUMMARY = "Support DVI pos: specials used by ConTeXt DVI output"
DESCRIPTION = "The dvipos package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66186"

RPM_NAME = "texlive-dvipos-2023.201.svn66186-53.2.noarch.rpm"
RPM_HASH = "e1205b7eacb10434ade312ce10a51110e01bfca11d55a5a7f1cf9544d56caaaf3211e426b02d7c54e0d7425f91ab78a853f268b1d3382093587f9ff984493eb1"
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
