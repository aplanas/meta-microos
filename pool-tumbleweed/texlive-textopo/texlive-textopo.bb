SUMMARY = "Annotated membrane protein topology plots"
DESCRIPTION = "A LaTeX package for setting shaded and annotated membrane \
protein topology plots and helical wheels."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.5svn23796"

RPM_NAME = "texlive-textopo-2023.209.1.5svn23796-55.1.noarch.rpm"
RPM_HASH = "fac62fa365aabfa426186247cc90a05ec81051e6443278a3c4f63c88d371405b71e669f723dbc5793d38bbf09e0c694aaac3ed80ad5473a1647a3bddfbc2890f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biotex.sty \
tex-textopo.def \
tex-textopo.sty \
texlive-textopo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-graphics.sty \
tex-texshade.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
