SUMMARY = "The hfbright fonts"
DESCRIPTION = "These are Adobe Type 1 versions of the OT1-encoded and maths \
parts of the Computer Modern Bright fonts."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn29349"

RPM_NAME = "texlive-hfbright-2023.201.svn29349-53.1.noarch.rpm"
RPM_HASH = "5f42008562c9feba25360352d86ed419a0a96beadbbef3b3ca9be4fb5b0cb753ee64a8d41eb76b7b60fae74620ddbf32b187b66c6e31ab8344fea6dc85d5605d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hfbright.map \
tex-hfmital.enc \
tex-hfmsa.enc \
tex-hfmsb.enc \
tex-hfmsym.enc \
tex-hfot1.enc \
texlive-hfbright"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-hfbright-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
