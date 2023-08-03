SUMMARY = "Slovak language module for the datetime2 package"
DESCRIPTION = "This module provides the 'slovak' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn52281"

RPM_NAME = "texlive-datetime2-slovak-2023.209.1.1svn52281-53.1.noarch.rpm"
RPM_HASH = "2503e4b2089454e88d1a35c277423c52454cbf9c6ce7c223acab3b93f4f685bd4610975ae9344fbeebebdc6c6deecd0a7ad35d3271a3b12893aa2fd6e8a1da96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-slovak-ascii.ldf \
tex-datetime2-slovak-utf8.ldf \
tex-datetime2-slovak.ldf \
texlive-datetime2-slovak"

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
