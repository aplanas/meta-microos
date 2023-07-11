SUMMARY = "Generate astrological charts in LaTeX"
DESCRIPTION = "The horoscop package provides a unified interface for \
astrological font packages; typesetting with pict2e of standard \
wheel charts and some variations, in PostScript- and \
PDF-generating TeX engines; and access to external calculation \
software (Astrolog and Swiss Ephemeris) for computing object \
positions."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.01svn56021"

RPM_NAME = "texlive-horoscop-2023.201.1.01svn56021-53.2.noarch.rpm"
RPM_HASH = "36860bb27a85534e63d2c1dd38df6326e103a2a8b2871264be47fb216fb3eb924cd88a3818c67d788a33d68559fe64a9afa0da6066b9a71cc2fc0b44fa3dc1d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-horoscop.sty \
texlive-horoscop"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-marvosym.sty \
tex-pict2e.sty \
tex-starfont.sty \
tex-trig.sty \
tex-wasysym.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
