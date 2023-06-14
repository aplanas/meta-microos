SUMMARY = "French cursive hand fonts"
DESCRIPTION = "A hand-writing font in the style of the French academic \
running-hand. The font was written in Metafont and has been \
converted to Adobe Type 1 format. LaTeX support (NFFS fd files, \
and a package) and font maps are provided."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn24559"

RPM_NAME = "texlive-frcursive-2023.201.svn24559-52.1.noarch.rpm"
RPM_HASH = "6bc007196d706aceae30f7689ce45fd7d698510085fd1516cd42db40b074f9881123c62aa1fefe0e79c2a0eefb68fdadbe0dd4d4a7ead39d7694360dbf61ae8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-frca10.tfm \
tex-frcbx10.tfm \
tex-frcbx14.tfm \
tex-frcbx6.tfm \
tex-frcc10.tfm \
tex-frcc14.tfm \
tex-frcc6.tfm \
tex-frcf10.tfm \
tex-frcf14.tfm \
tex-frcf6.tfm \
tex-frcr10.tfm \
tex-frcr14.tfm \
tex-frcr6.tfm \
tex-frcsl10.tfm \
tex-frcsl14.tfm \
tex-frcsl6.tfm \
tex-frcslbx10.tfm \
tex-frcslbx14.tfm \
tex-frcslbx6.tfm \
tex-frcslc10.tfm \
tex-frcslc14.tfm \
tex-frcslc6.tfm \
tex-frcursive.map \
tex-frcursive.sty \
tex-frcw10.tfm \
tex-ot1frc.fd \
tex-t1frc.fd \
texlive-frcursive"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontenc.sty \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-frcursive-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
