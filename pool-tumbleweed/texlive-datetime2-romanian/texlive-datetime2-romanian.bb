SUMMARY = "Romanian language module for the datetime2 package"
DESCRIPTION = "This module provides the 'romanian' style that can be set using \
\\DTMsetstyle provided by datetime2.sty."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn56394"

RPM_NAME = "texlive-datetime2-romanian-2023.209.1.02svn56394-53.1.noarch.rpm"
RPM_HASH = "57a19c7908c3c801990289048cd589238ba47a25a239ed78846516788b9b5c39a4c12daf9befb14dab38686faa61306d56872c92840f67449d986c05ee2ec6f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-romanian-ascii.ldf \
tex-datetime2-romanian-utf8.ldf \
tex-datetime2-romanian.ldf \
texlive-datetime2-romanian"

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
