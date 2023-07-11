SUMMARY = "Conversion of punctuation in maths mode"
DESCRIPTION = "The package modifies the behaviour of characters in maths mode \
so that: '.' is used as a one-thousand separator (as is common \
in Germany) ',' is used as a decimal separator (as is common in \
Germany) '--' is represented with spacing as appropriate to \
such constructs as '1.000,--'. These conversions may be \
switched on and off."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn32279"

RPM_NAME = "texlive-ziffer-2023.201.2.1svn32279-52.2.noarch.rpm"
RPM_HASH = "8a3a02a2405d4c4174b1961e7ada14ca944bcc0438521fdd999df613600b51f19aaf225698a98911f102c131f5bfa5c14d67cf8828cd36adab3a8a29b77ee506"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ziffer.sty \
texlive-ziffer"

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
