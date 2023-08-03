SUMMARY = "The hfbright fonts"
DESCRIPTION = "These are Adobe Type 1 versions of the OT1-encoded and maths \
parts of the Computer Modern Bright fonts."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn29349"

RPM_NAME = "texlive-hfbright-2023.209.svn29349-54.1.noarch.rpm"
RPM_HASH = "cc32469add24c6ed980551deb6137b7b10fadbf224e104e8c97fe3650884267f935aa34547d31b11cdb2f84e87c56d03582e9d3d342e6b8580926845e25a6032"
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
