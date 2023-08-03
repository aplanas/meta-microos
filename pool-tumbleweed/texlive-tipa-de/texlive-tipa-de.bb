SUMMARY = "German translation of tipa documentation"
DESCRIPTION = "This is a translation of Fukui Rei's tipaman from the tipa \
bundle."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn22005"

RPM_NAME = "texlive-tipa-de-2023.209.1.3svn22005-53.1.noarch.rpm"
RPM_HASH = "f888dd9de092c52d68419c154dabbad6184e58ee33c99ae9198eafa86ed1ce3d57b9e151a482b6fb46c7a5b1dcf4fac20ed565dae4d07d7ea82bfcf0b3437562"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tipa-de"

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
