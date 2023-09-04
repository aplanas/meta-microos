SUMMARY = "The hfbright fonts"
DESCRIPTION = "These are Adobe Type 1 versions of the OT1-encoded and maths \
parts of the Computer Modern Bright fonts."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn29349"

RPM_NAME = "texlive-hfbright-2023.209.svn29349-54.2.noarch.rpm"
RPM_HASH = "0775d2928a7b825c136505c95abe7c8de29059312acecf8c10820ddf39f6b06f53f91c9f3d925de9e21135a35c02057dfdb748b19e229df85a36ae98eec13e89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hfbright.map \
tex-hfmital.enc \
tex-hfmsa.enc \
tex-hfmsb.enc \
tex-hfmsym.enc \
tex-hfot1.enc \
texlive-hfbright"

RDEPENDS:${PN} += "/usr/bin/sh \
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
