SUMMARY = "Extra harpoons, using the graphics package"
DESCRIPTION = "Provides over- and under-harpoon symbol commands; the harpoons \
may point in either direction, with the hook pointing up or \
down. The covered object is provided as an argument to the \
commands, so that they have the look of accent commands."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn21327"

RPM_NAME = "texlive-harpoon-2023.209.1.0svn21327-54.2.noarch.rpm"
RPM_HASH = "eeb08d71c4d8e9bf73b310b97486d1f45c547426a726009cccdedd08952c55a4d1468f1749a8c0c90fb637fabdb99744d825fd9c3f74bdea47f256129002e52a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-harpoon.sty \
texlive-harpoon"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphics.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
