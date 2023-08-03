SUMMARY = "Transactions of the ASAE"
DESCRIPTION = "A class and BibTeX style for submissions to the Transactions of \
the American Society of Agricultural Engineers. Also included \
is the Metafont source of a slanted Computer Modern Caps and \
Small Caps font."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0asvn15878"

RPM_NAME = "texlive-asaetr-2023.209.1.0asvn15878-54.1.noarch.rpm"
RPM_HASH = "c6c57f0256b08acce8fc01dfba5623ac40b11a64bdb9792a46b7bc9675030ba38fe1c8be0b05838aa8d3b3df34202ea3950a3984e8700830dfd1eebd9453a591"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-asaesub.sty \
tex-asaetr.cls \
tex-asaetr.sty \
texlive-asaetr"

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
