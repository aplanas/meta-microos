SUMMARY = "Galician language module for the datetime2 package"
DESCRIPTION = "This module provides the 'galician' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn47631"

RPM_NAME = "texlive-datetime2-galician-2023.209.1.0svn47631-53.1.noarch.rpm"
RPM_HASH = "4e70fd66d282828138e4237b948a6fa3692447ddbb45f978e6a302cace8984614c71aeac7be441b433c9757677b9dc0054e982338e1f5bdfde15c7aaeaea5fc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-galician-ascii.ldf \
tex-datetime2-galician-utf8.ldf \
tex-datetime2-galician.ldf \
texlive-datetime2-galician"

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
