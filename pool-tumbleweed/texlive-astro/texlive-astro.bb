SUMMARY = "Astronomical (planetary) symbols"
DESCRIPTION = "Astrosym is a font containing astronomical symbols, including \
those used for the planets, four planetoids, the phases of the \
moon, the signs of the zodiac, and some additional symbols. The \
font is distributed as Metafont source."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.20svn15878"

RPM_NAME = "texlive-astro-2023.209.2.20svn15878-54.1.noarch.rpm"
RPM_HASH = "05c01bf01aafffc1503b11983db12d32372525fcbabd2169d772991ba9939b61639327b180bf50b0265386b3c0da63e28e95f9395e6186592b60ea548e4c7125"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-astrosym.tfm \
texlive-astro"

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
