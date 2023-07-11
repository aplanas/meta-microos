SUMMARY = "The hfbright fonts"
DESCRIPTION = "These are Adobe Type 1 versions of the OT1-encoded and maths \
parts of the Computer Modern Bright fonts."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn29349"

RPM_NAME = "texlive-hfbright-2023.201.svn29349-53.2.noarch.rpm"
RPM_HASH = "f23ec86c91a5f0718fbd7912f1bb9db163f5fc311e645701595ea57df9ba1c60e0a7fa6f8d1dda8e200ce5d2a10b37e0d69356c2887ad7abe36802a61dae80e4"
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
