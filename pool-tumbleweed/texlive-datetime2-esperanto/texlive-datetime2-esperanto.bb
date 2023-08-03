SUMMARY = "Esperanto language module for the datetime2 package"
DESCRIPTION = "This module provides the 'esperanto' style that can be set \
using \\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn47356"

RPM_NAME = "texlive-datetime2-esperanto-2023.209.1.1svn47356-53.1.noarch.rpm"
RPM_HASH = "1b2769fc9667363aba2b54300f6c8b98c99d3128bfb30c2af993a7360262098fe48b5c5f1c62e2ee7080da08714d5eaa20bec2f5921ce1cbc844eac751f3879d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-esperanto-ascii.ldf \
tex-datetime2-esperanto-utf8.ldf \
tex-datetime2-esperanto.ldf \
texlive-datetime2-esperanto"

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
