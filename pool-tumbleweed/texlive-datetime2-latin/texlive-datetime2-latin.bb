SUMMARY = "Latin language module for the datetime2 package"
DESCRIPTION = "This module provides the 'latin' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn47748"

RPM_NAME = "texlive-datetime2-latin-2023.209.1.0svn47748-53.1.noarch.rpm"
RPM_HASH = "430f72dd7bd7a1931f3595bcbf06bfe4469fafec423bca7f31a954c41903a80641a6d07580684f37a3258a3fbb6c3fa2e5c75979badb43e528fb8b7b5923a377"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-latin.ldf \
texlive-datetime2-latin"

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
