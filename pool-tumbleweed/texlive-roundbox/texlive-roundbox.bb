SUMMARY = "Round boxes in LaTeX"
DESCRIPTION = "This package implements a command \\roundbox that can be used, \
in LaTeX, for producing boxes, framed with rounded corners."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn29675"

RPM_NAME = "texlive-roundbox-2023.209.0.0.2svn29675-54.1.noarch.rpm"
RPM_HASH = "2e1a89e164cb68b961c844a3fa5bdf3130489a2067b74d4164fad76131445cdb6fff7822e79e24be514bda78c29d4f2550665c55d1820ff9dc6b13877bcf9f8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-roundbox.sty \
texlive-roundbox"

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
