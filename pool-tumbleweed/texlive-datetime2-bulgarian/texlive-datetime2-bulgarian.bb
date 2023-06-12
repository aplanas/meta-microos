SUMMARY = "Bulgarian language module for the datetime2 package"
DESCRIPTION = "This module provides the 'bulgarian' style that can be set \
using \\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn47031"

RPM_NAME = "texlive-datetime2-bulgarian-2023.201.1.1svn47031-52.1.noarch.rpm"
RPM_HASH = "02c25648ab70b35009203e86cbb5df4c453c6a72a9aa79681a5e1eea2ea7bb7879c45885e364051aad8add20e9acc2d2840c4184521cc0a5c3a35a29e642bfb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(datetime2-bulgarian-ascii.ldf) \
tex(datetime2-bulgarian-utf8.ldf) \
tex(datetime2-bulgarian.ldf) \
texlive-datetime2-bulgarian"
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
