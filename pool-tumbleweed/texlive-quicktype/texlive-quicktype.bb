SUMMARY = "LaTeX package for quick typesetting"
DESCRIPTION = "Intended for the quick typesetting of basic documents using \
LaTeX using shortcuts to existing commands and specific \
commands for quick formatting and creation of tables and title \
pages with a graphic image."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn42183"

RPM_NAME = "texlive-quicktype-2023.201.0.0.1svn42183-53.2.noarch.rpm"
RPM_HASH = "017e3259e7209a85298bf635a6836ea8e3edd99fde05092f7a6b2affa011d5352d19db11330186af5fd0244cab3f15c568df84a41fe880ff7b92376ce124f1f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quicktype.sty \
texlive-quicktype"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
