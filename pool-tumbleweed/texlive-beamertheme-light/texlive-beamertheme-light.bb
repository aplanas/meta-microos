SUMMARY = "A minimal beamer style"
DESCRIPTION = "The LaTeX package beamertheme-light provides an aesthetic and \
minimal beamer style by redefining colors and fonts."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn49867"

RPM_NAME = "texlive-beamertheme-light-2023.209.1.0svn49867-54.1.noarch.rpm"
RPM_HASH = "17a7616bcabe01a72df04f98a03288201db7d38dcd3a4849bc6c6f4a942ca427f1bb0f5941f2322b8856ab6414527dd626a6530529553f1db9cfc83b1ae03fdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamertheme-light.sty \
texlive-beamertheme-light"

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
