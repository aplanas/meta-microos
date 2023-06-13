SUMMARY = "Esperanto language module for the datetime2 package"
DESCRIPTION = "This module provides the 'esperanto' style that can be set \
using \\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn47356"

RPM_NAME = "texlive-datetime2-esperanto-2023.201.1.1svn47356-52.1.noarch.rpm"
RPM_HASH = "1a3dcd879b242e029c17643dacf2220dc2d6aca9e78a855067070420678890920542bdf82d7f9171848f6c6be6fb330b3f401c14f3543ba47158682d3469e100"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(datetime2-esperanto-ascii.ldf) \
tex(datetime2-esperanto-utf8.ldf) \
tex(datetime2-esperanto.ldf) \
texlive-datetime2-esperanto"

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
