SUMMARY = "Generate astrological charts in LaTeX"
DESCRIPTION = "The horoscop package provides a unified interface for \
astrological font packages; typesetting with pict2e of standard \
wheel charts and some variations, in PostScript- and \
PDF-generating TeX engines; and access to external calculation \
software (Astrolog and Swiss Ephemeris) for computing object \
positions."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.01svn56021"

RPM_NAME = "texlive-horoscop-2023.209.1.01svn56021-54.1.noarch.rpm"
RPM_HASH = "10ba0702d89e0b10e3802694cdfd560bdbed9cdc4144074790c2cdc1ed844f3a0d9b692b4e82c123a0ac00acfd3b111e104b7119199942b335d12309d5e81363"
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
