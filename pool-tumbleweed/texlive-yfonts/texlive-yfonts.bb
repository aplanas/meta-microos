SUMMARY = "Support for old German fonts"
DESCRIPTION = "A LaTeX interface to the old-german fonts designed by Yannis \
Haralambous: Gothic, Schwabacher, Fraktur and the baroque \
initials."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn50755"

RPM_NAME = "texlive-yfonts-2023.209.1.4svn50755-53.1.noarch.rpm"
RPM_HASH = "372e5e4ef5130474079202b6f96ac73b11df06c0ecac8376baec097898590cf6cc236502d173baa207cc7dd47d10743c69ae1e060a06502108daa919b00cbb06"
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
