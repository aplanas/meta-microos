SUMMARY = "A simple beamer theme using the 'Nord' color theme"
DESCRIPTION = "This package provides a simple beamer theme using the Nord \
color theme."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.0svn56180"

RPM_NAME = "texlive-beamerthemenord-2023.201.0.0.2.0svn56180-53.1.noarch.rpm"
RPM_HASH = "136605e408ed856b8808240e038c0259030b2fcb1348280c6433ea7bfb674da74dc690ca71d22a375047fd11622682b1ffe95bfe0fb37f73aa8b04a4265c34f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemeNord.sty \
tex-beamerfontthemeNord.sty \
tex-beamerthemeNord.sty \
texlive-beamerthemenord"

RDEPENDS:${PN} += "/bin/sh \
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
