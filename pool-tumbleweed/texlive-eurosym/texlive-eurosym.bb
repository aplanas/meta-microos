SUMMARY = "Metafont and macros for Euro sign"
DESCRIPTION = "The European currency symbol for the Euro implemented in \
Metafont, using the official European Commission dimensions, \
and providing several shapes (normal, slanted, bold, outline). \
The package also includes a LaTeX package which defines the \
macro, pre-compiled tfm files, and documentation."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4_subrfixsvn17265"

RPM_NAME = "texlive-eurosym-2023.209.1.4_subrfixsvn17265-53.1.noarch.rpm"
RPM_HASH = "d3547661fe0264605cce4f0cebc4f9464094daced0c5cc6c0401a9d7f070d742e796b54d4ae80ff2a2ab8d8666360d1cbfdda18322b499a84cdded5ebcf3f6a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eurosym.map \
tex-eurosym.sty \
tex-feybl10.tfm \
tex-feybo10.tfm \
tex-feybr10.tfm \
tex-feyml10.tfm \
tex-feymo10.tfm \
tex-feymr10.tfm \
texlive-eurosym"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-eurosym-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
