SUMMARY = "Insert hyperlinked ORCiD logo"
DESCRIPTION = "This package provides a command to insert the ORCiD logo, which \
is hyperlinked to the URL of the researcher whose iD was \
specified."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.4svn59560"

RPM_NAME = "texlive-orcidlink-2023.209.1.0.4svn59560-55.1.noarch.rpm"
RPM_HASH = "617a6b331467744ed87a597978d9d25fb8e226f65416ab9eed647bb13c33d4655170b4f6efcc5d853ea240559c1710d1e9811c01801fe37a0af48c52549a348e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-orcidlink.sty \
texlive-orcidlink"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
