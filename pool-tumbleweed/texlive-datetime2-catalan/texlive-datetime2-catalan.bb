SUMMARY = "Catalan language module for the datetime2 package"
DESCRIPTION = "This module provides the 'catalan' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn47032"

RPM_NAME = "texlive-datetime2-catalan-2023.209.1.1svn47032-53.1.noarch.rpm"
RPM_HASH = "265b7698484e9035c2e287e853d0d68e9b3f03b2f23e8a24067130956b9a3b2160366f559bf8530ec08435a8189dfbf5d885988c069c78b45927e5fdc0c5dfa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-catalan-ascii.ldf \
tex-datetime2-catalan-utf8.ldf \
tex-datetime2-catalan.ldf \
texlive-datetime2-catalan"

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
