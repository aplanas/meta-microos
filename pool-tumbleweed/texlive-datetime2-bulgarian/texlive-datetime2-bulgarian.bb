SUMMARY = "Bulgarian language module for the datetime2 package"
DESCRIPTION = "This module provides the 'bulgarian' style that can be set \
using \\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn47031"

RPM_NAME = "texlive-datetime2-bulgarian-2023.209.1.1svn47031-53.1.noarch.rpm"
RPM_HASH = "5546bd8e2c268ddc6c0f02a7b3202b04bf3e64c41f33f10d0ddc73c69579997a69a10956a7f9a237e40ed702b9e2de7fe35370185ef014f0bd5b55634c0f7a72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-bulgarian-ascii.ldf \
tex-datetime2-bulgarian-utf8.ldf \
tex-datetime2-bulgarian.ldf \
texlive-datetime2-bulgarian"

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
