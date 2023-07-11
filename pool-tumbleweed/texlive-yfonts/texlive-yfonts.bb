SUMMARY = "Support for old German fonts"
DESCRIPTION = "A LaTeX interface to the old-german fonts designed by Yannis \
Haralambous: Gothic, Schwabacher, Fraktur and the baroque \
initials."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn50755"

RPM_NAME = "texlive-yfonts-2023.201.1.4svn50755-52.2.noarch.rpm"
RPM_HASH = "8cb334356baf7dcee7557dd0ebf9742d320eafc8cbe36247202d2d2fa52990cace43ee36c76fb248b79116c8cefe40adbfd068e6a29bbbd83432f5b905eeb111"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-yfonts.sty \
texlive-yfonts"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
