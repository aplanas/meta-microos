SUMMARY = "Sympathetically spaced ellipsis after punctuation"
DESCRIPTION = "The package provides commands that give a well-spaced ellipsis \
after !, ?, !? or ?!."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn22931"

RPM_NAME = "texlive-eqell-2023.209.svn22931-54.1.noarch.rpm"
RPM_HASH = "f7a6696f0d0a5f2eda8601c658c3ad26ad60225f8bc3b1e0751864765df1794a27e063a1470e610a4147c1c4729fae0cb3581058056ad0a50726e3776af23a7b"
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
