SUMMARY = "Support for users in Telecommunications Engineering"
DESCRIPTION = "The package provides a wide range of abbreviations for terms \
used in Telecommunications Engineering."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.2svn28571"

RPM_NAME = "texlive-engtlc-2023.209.3.2svn28571-54.1.noarch.rpm"
RPM_HASH = "472889bf27e79fc95e760d3d6f0c80cdcdc2d5f2abd765f3619e787d0cd9a8a55451ff85529f97a97999afbedcc28eb04b6cf14dc96e592777fe1d2cef3fc903"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-engtlc.sty \
texlive-engtlc"

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
