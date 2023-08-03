SUMMARY = "'Build Your Own Twemojis' with TikZ"
DESCRIPTION = "This package provides the means to create your own emojis (the \
simple, round, and mostly yellow ones) from elements of \
existing emojis. The provided command creates a TikZ picture \
from the stated elements with multiple possibilities to modify \
the result in color and position."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn58917"

RPM_NAME = "texlive-byo-twemojis-2023.209.1.0svn58917-53.1.noarch.rpm"
RPM_HASH = "d6650eda07b4daf51b78cb15bdbb418bbfe8fc86d2928a80bdf42673a055ee5032369f38039d02fabf2d3fd0e8d63f2408fa1adb2c8910bc1892213237281e0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-byo-twemojis.sty \
texlive-byo-twemojis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-tikz.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
