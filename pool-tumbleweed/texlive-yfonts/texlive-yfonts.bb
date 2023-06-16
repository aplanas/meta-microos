SUMMARY = "Support for old German fonts"
DESCRIPTION = "A LaTeX interface to the old-german fonts designed by Yannis \
Haralambous: Gothic, Schwabacher, Fraktur and the baroque \
initials."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn50755"

RPM_NAME = "texlive-yfonts-2023.201.1.4svn50755-52.1.noarch.rpm"
RPM_HASH = "e0903e744f6b0029ef7d5c0c6ffbcdc412237d036dc6c87f27b50ef1cea242fce772b21b71ccfb33a007483bb835f621189856ff69bc1da97bf4f01d797b82aa"
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
