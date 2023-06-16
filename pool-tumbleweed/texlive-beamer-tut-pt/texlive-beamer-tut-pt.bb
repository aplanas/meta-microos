SUMMARY = "An introduction to the Beamer class, in Portuguese"
DESCRIPTION = "The beamer-tut-pt package"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-beamer-tut-pt-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "608ed578c1284a9b0269f52a2bc2469be05ae3e7c52e7dff9a570fc72c6270480f1f531c6ba8e8acaa8bfa595a6a411a33709e414c0867e7e201cb26fd35ff13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamer-tut-pt"

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
