SUMMARY = "Fonts with the Plimsoll symbol and LaTeX support"
DESCRIPTION = "This package provides access to the Plimsoll symbol for use \
with LaTeX. The Plimsoll symbol is sometimes used in chemistry \
for denoting standard states and values. The LaTeX package \
provides access to this notation as well. The syntax for \
denoting the standard state is the same as suggested in the \
Comprehensive LaTeX Symbol List for emulating the Plimsoll \
mark."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1svn56605"

RPM_NAME = "texlive-plimsoll-2023.209.1svn56605-53.1.noarch.rpm"
RPM_HASH = "092f7291555575ae3ddc6045a592749116503ab03e08063bbedcd9b294ff4e13b8650a360e8c88cb08501a0179d9abde2714bf856fdc2febc915515a464dc36e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-plimsoll-sans.tfm \
tex-plimsoll.enc \
tex-plimsoll.map \
tex-plimsoll.sty \
tex-plimsoll.tfm \
texlive-plimsoll"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-plimsoll-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
