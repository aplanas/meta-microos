SUMMARY = "Sympathetically spaced ellipsis after punctuation"
DESCRIPTION = "The package provides commands that give a well-spaced ellipsis \
after !, ?, !? or ?!."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn22931"

RPM_NAME = "texlive-eqell-2023.201.svn22931-53.1.noarch.rpm"
RPM_HASH = "65b826043893f24c2bfa2deb333feab06c5570e3c9c75acecc197e640cb64f9ee1392c721ccff8ea2a974be18cbd83ec793f09a1b7d9b98f90f290891d534d00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eqell.sty \
texlive-eqell"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
