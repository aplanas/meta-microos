SUMMARY = "Generate astrological charts in LaTeX"
DESCRIPTION = "The horoscop package provides a unified interface for \
astrological font packages; typesetting with pict2e of standard \
wheel charts and some variations, in PostScript- and \
PDF-generating TeX engines; and access to external calculation \
software (Astrolog and Swiss Ephemeris) for computing object \
positions."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.01svn56021"

RPM_NAME = "texlive-horoscop-2023.201.1.01svn56021-53.1.noarch.rpm"
RPM_HASH = "b1946d00752dc28f526f546abf8be15aef7fd2f9d4b427f09d57304f68a499d164f6c9ae1b16af6a7ddaae2213317c26bea883ee21ed9e7a5b1915f5ade094ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-horoscop.sty \
texlive-horoscop"

RDEPENDS:${PN} += "/bin/sh \
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
