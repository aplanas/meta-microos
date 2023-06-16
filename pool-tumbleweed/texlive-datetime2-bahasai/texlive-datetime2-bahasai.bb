SUMMARY = "Bahasai language module for the datetime2 package"
DESCRIPTION = "This module provides the 'bahasai' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.204.1.01svn46287"

RPM_NAME = "texlive-datetime2-bahasai-2023.204.1.01svn46287-54.1.noarch.rpm"
RPM_HASH = "dc8b0555be4d626a2ca5a32e3a070b311a8b1c44c9c2d049638cd3021a75601567201fdfded0d22e1750f85b31414341c88c002c492ce1701204e40c08879967"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-bahasai.ldf \
texlive-datetime2-bahasai"

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
