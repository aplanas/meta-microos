SUMMARY = "Conversion of punctuation in maths mode"
DESCRIPTION = "The package modifies the behaviour of characters in maths mode \
so that: '.' is used as a one-thousand separator (as is common \
in Germany) ',' is used as a decimal separator (as is common in \
Germany) '--' is represented with spacing as appropriate to \
such constructs as '1.000,--'. These conversions may be \
switched on and off."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn32279"

RPM_NAME = "texlive-ziffer-2023.209.2.1svn32279-53.2.noarch.rpm"
RPM_HASH = "ae094ad32857073c28b81a1247fd16fae6afaffccfa9aa1d350bbb6e974ce3d19412e7fd30f170cad7220e2cf7ccf39acac726293f2952cb4db73462ebb8b458"
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
