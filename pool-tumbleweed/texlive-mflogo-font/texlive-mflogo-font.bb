SUMMARY = "Metafont logo font"
DESCRIPTION = "These fonts were created in Metafont by Knuth, for his own \
publications. At some stage, the letters 'P' and 'S' were \
added, so that the MetaPost logo could also be expressed. The \
fonts were originally issued (of course) as Metafont source; \
they have since been autotraced and reissued in Adobe Type 1 \
format by Taco Hoekwater."
LICENSE = "SUSE-TeX"

PV = "2023.209.1.002svn54512"

RPM_NAME = "texlive-mflogo-font-2023.209.1.002svn54512-55.1.noarch.rpm"
RPM_HASH = "29c69babb2d8cdba2e1fce5886b5504e5da243a91d3c0a28b12a99ee8fbd3de9f3818ebd7f0c911560e070c32096879521f156114eb6267b3b32ac21919ca31b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mflogo.map \
texlive-mflogo-font"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-mflogo-font-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
