SUMMARY = "A simple beamer theme using the 'Nord' color theme"
DESCRIPTION = "This package provides a simple beamer theme using the Nord \
color theme."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.0svn56180"

RPM_NAME = "texlive-beamerthemenord-2023.209.0.0.2.0svn56180-54.1.noarch.rpm"
RPM_HASH = "63f091b68fc55eab9e48ea5caddd47e582ede9d9a768a264f3c373950e580ccd0279d4daa37bfe90c689bd03aec5e921169ee0b6a4228d5ea94ab019994cbff1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemeNord.sty \
tex-beamerfontthemeNord.sty \
tex-beamerthemeNord.sty \
texlive-beamerthemenord"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
