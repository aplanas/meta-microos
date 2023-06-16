SUMMARY = "Eepic facilities using pict2e"
DESCRIPTION = "The package provides an eepic driver to use pict2e facilities."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn30559"

RPM_NAME = "texlive-bxeepic-2023.201.0.0.2svn30559-52.1.noarch.rpm"
RPM_HASH = "0849610022184ffc3415b15029c014c0499f15c3f06323b29ed471f7d077782d8014bc7a3fb42a8635e776a88b0c6a5d607ba3723221b2e2ae1a6069942cd805"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxdpxp2e.def \
tex-bxeepic.sty \
texlive-bxeepic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pict2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
