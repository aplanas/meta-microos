SUMMARY = "A theme for the beamer class"
DESCRIPTION = "This package provides the 'Verona' theme for the beamer class \
by Till Tantau."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn39180"

RPM_NAME = "texlive-beamer-verona-2023.209.0.0.2svn39180-54.1.noarch.rpm"
RPM_HASH = "381033a513bdc09a9f260c3b9e38dfb7fd4c2d68af2ee2b1fbcb49bd073130990893e5aca42ebc2359a6ddf72be68091e7370f9bcee9a14a4d5abc5d32241e60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerthemeVerona.sty \
texlive-beamer-verona"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tcolorbox.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
