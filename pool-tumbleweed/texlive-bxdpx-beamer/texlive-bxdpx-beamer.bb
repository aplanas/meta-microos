SUMMARY = "Dvipdfmx extras for use with beamer"
DESCRIPTION = "The package is a driver to support beamer Navigation symbols \
and \\framezoomed regions when using dvipdfmx as PDF generator \
(e.g., as part of e-pTeX). The package does not define any \
'user' commands."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn41813"

RPM_NAME = "texlive-bxdpx-beamer-2023.209.0.0.3svn41813-53.1.noarch.rpm"
RPM_HASH = "235848954d6d19f8bf09d512ca4ee8ce8c214f3409bf6671b5c76e82fbfd30b8b6a3150d2560198fffa90bf7d8ecf535238140806835adaf176884bf87c39255"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxdpx-beamer.sty \
texlive-bxdpx-beamer"

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
