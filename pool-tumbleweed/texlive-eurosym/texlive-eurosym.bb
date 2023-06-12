SUMMARY = "Metafont and macros for Euro sign"
DESCRIPTION = "The European currency symbol for the Euro implemented in \
Metafont, using the official European Commission dimensions, \
and providing several shapes (normal, slanted, bold, outline). \
The package also includes a LaTeX package which defines the \
macro, pre-compiled tfm files, and documentation."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4_subrfixsvn17265"

RPM_NAME = "texlive-eurosym-2023.201.1.4_subrfixsvn17265-52.1.noarch.rpm"
RPM_HASH = "e272cbd6b0fd23c5ef33c98fbaa4e4518f02ef517cd76e934a04a371381d22fb0d3d4dfd8bd531e67961b4157f8d05a142b6069a16b3b4d81f746199f926f2a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(eurosym.map) \
tex(eurosym.sty) \
tex(feybl10.tfm) \
tex(feybo10.tfm) \
tex(feybr10.tfm) \
tex(feyml10.tfm) \
tex(feymo10.tfm) \
tex(feymr10.tfm) \
texlive-eurosym"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(updmap.cfg) \
texlive \
texlive-eurosym-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
