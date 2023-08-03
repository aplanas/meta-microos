SUMMARY = "Ukrainian language module for the datetime2 package"
DESCRIPTION = "This module provides the 'ukrainian' style that can be set \
using \\DTMsetstyle provided by datetime2.sty."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2asvn47552"

RPM_NAME = "texlive-datetime2-ukrainian-2023.209.1.2asvn47552-53.1.noarch.rpm"
RPM_HASH = "69ed44a8eb2a362834ef1dfc6cf2a954a539fabccb63bfa842e2401552ad204aafbb0872235f0cc882bafb23840c227e4fb45c1908c0d30318bbacd6516ed49a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-ukrainian-ascii.ldf \
tex-datetime2-ukrainian-utf8.ldf \
tex-datetime2-ukrainian.ldf \
texlive-datetime2-ukrainian"

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
