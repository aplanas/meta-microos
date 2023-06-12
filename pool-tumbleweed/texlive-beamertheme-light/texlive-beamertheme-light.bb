SUMMARY = "A minimal beamer style"
DESCRIPTION = "The LaTeX package beamertheme-light provides an aesthetic and \
minimal beamer style by redefining colors and fonts."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn49867"

RPM_NAME = "texlive-beamertheme-light-2023.201.1.0svn49867-53.1.noarch.rpm"
RPM_HASH = "a1fa227c072bd9eb1fe82f3882e0efb22a4745d87000ab3bdd9f7f29666c2ba969cfe9bd5f2ad6af31b66d886d9329d6cab570c13cab7673e0506281c3c1e3e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(beamertheme-light.sty) \
texlive-beamertheme-light"
RDEPENDS:${PN} += "/bin/sh \
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
