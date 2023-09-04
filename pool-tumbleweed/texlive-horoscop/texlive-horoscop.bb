SUMMARY = "Generate astrological charts in LaTeX"
DESCRIPTION = "The horoscop package provides a unified interface for \
astrological font packages; typesetting with pict2e of standard \
wheel charts and some variations, in PostScript- and \
PDF-generating TeX engines; and access to external calculation \
software (Astrolog and Swiss Ephemeris) for computing object \
positions."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.01svn56021"

RPM_NAME = "texlive-horoscop-2023.209.1.01svn56021-54.2.noarch.rpm"
RPM_HASH = "bec4f97bfbf615c0edc0b10626392ff177e99eff06d715b342868762965be6cc430dec3ea1eb471fb6f718fac38f7563bea816c6e32cf5e79fff9063e3a30eef"
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
