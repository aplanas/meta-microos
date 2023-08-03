SUMMARY = "Insert pagebreak if not enough space"
DESCRIPTION = "Provides commands to disable pagebreaking within a given \
vertical space. If there is not enough space between the \
command and the bottom of the page, a new page will be started."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3dsvn29601"

RPM_NAME = "texlive-needspace-2023.209.1.3dsvn29601-55.1.noarch.rpm"
RPM_HASH = "243cefd1ff04966a7a612e5dd0a4e4e241a54bbc66577fcb91d0a648b0857067559963eeca31cc5a912c76663dfe90a26759e5c2f42b04232cbb241d77f73504"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-needspace.sty \
texlive-needspace"

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
