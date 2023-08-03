SUMMARY = "TeX support (from CJK) for the garuda font"
DESCRIPTION = "The garuda-c90 package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn60832"

RPM_NAME = "texlive-garuda-c90-2023.209.svn60832-53.1.noarch.rpm"
RPM_HASH = "0fe2299e2619d42d88fda9eb4637febeccdb08b39b8327da5cb2e2756760731fb59525b5c9996f2bb2b6917357d8a17f6b6a6c6c75daae1c52b5e32e41ea1600"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fgdb8z.tfm \
tex-fgdbo8z.tfm \
tex-fgdo8z.tfm \
tex-fgdr8z.tfm \
tex-garuda-c90.map \
texlive-garuda-c90"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-fonts-tlwg \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
