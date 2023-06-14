SUMMARY = "Icelandic language module for the datetime2 package"
DESCRIPTION = "This module provides the 'icelandic' style that can be set \
using \\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn65213"

RPM_NAME = "texlive-datetime2-icelandic-2023.201.1.2svn65213-52.1.noarch.rpm"
RPM_HASH = "f0027f6ef452298ca8a44b76b8d5db87a31fb6235f1daeafc8a3ed1ffd8dd64a91c631bb1d19a0a9249c4ec09eb19dcf6fddacd567218d25d35d0340bb9946c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-icelandic-ascii.ldf \
tex-datetime2-icelandic-utf8.ldf \
tex-datetime2-icelandic.ldf \
texlive-datetime2-icelandic"

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
