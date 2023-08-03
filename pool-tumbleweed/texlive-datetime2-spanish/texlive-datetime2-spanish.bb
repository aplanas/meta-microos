SUMMARY = "Spanish language module for the datetime2 package"
DESCRIPTION = "This module provides the 'spanish' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn45785"

RPM_NAME = "texlive-datetime2-spanish-2023.209.1.1svn45785-53.1.noarch.rpm"
RPM_HASH = "6cdb66f640cd47ce378515aa511e0ab8c179e6e9ecbd084766b9c3f20f0163dffb8d2da47548b7226eb13326e5ae41b5604ed042ab7d206822fd06960f5cf0b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-spanish-ascii.ldf \
tex-datetime2-spanish-utf8.ldf \
tex-datetime2-spanish.ldf \
texlive-datetime2-spanish"

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
