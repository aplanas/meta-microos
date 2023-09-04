SUMMARY = "Finnish language module for glossaries package"
DESCRIPTION = "Finnish language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn54080"

RPM_NAME = "texlive-glossaries-finnish-2023.209.1.0svn54080-54.2.noarch.rpm"
RPM_HASH = "75a6c1e84b6e9dda1a4b99c899f35371a2b46e21a41c61c0300cb92d9e25b073ba4b87ecee222f243e3da409a2c4fcdb93c2e71fd3579525f31a3e1ea6d1d57e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-finnish-ascii.ldf \
tex-glossaries-finnish-utf8.ldf \
tex-glossaries-finnish.ldf \
texlive-glossaries-finnish"

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
