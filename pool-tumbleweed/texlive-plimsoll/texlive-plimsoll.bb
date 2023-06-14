SUMMARY = "Fonts with the Plimsoll symbol and LaTeX support"
DESCRIPTION = "This package provides access to the Plimsoll symbol for use \
with LaTeX. The Plimsoll symbol is sometimes used in chemistry \
for denoting standard states and values. The LaTeX package \
provides access to this notation as well. The syntax for \
denoting the standard state is the same as suggested in the \
Comprehensive LaTeX Symbol List for emulating the Plimsoll \
mark."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1svn56605"

RPM_NAME = "texlive-plimsoll-2023.201.1svn56605-52.1.noarch.rpm"
RPM_HASH = "49122665ce0273400f1dd1fc939a6c0f03778639919b298d49fda13b1bd28861619f128e420c395529715dd2c025f4aa1efd73aa13ee2fcd44120354d4cd76c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-plimsoll-sans.tfm \
tex-plimsoll.enc \
tex-plimsoll.map \
tex-plimsoll.sty \
tex-plimsoll.tfm \
texlive-plimsoll"

RDEPENDS:${PN} += "/bin/sh \
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
