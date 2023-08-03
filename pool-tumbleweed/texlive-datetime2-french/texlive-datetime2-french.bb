SUMMARY = "French language module for the datetime2 package"
DESCRIPTION = "This module provides the 'french' style that can be set using \
\\DTMsetstyle provided by datetime2.sty."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.03svn56393"

RPM_NAME = "texlive-datetime2-french-2023.209.1.03svn56393-53.1.noarch.rpm"
RPM_HASH = "fc6d5eea63ca48e6d04ac5f35469b23349d6f832096f6db68d222f1896bdcfd9d370ff8e8de73fa4fb0b3747d3b62950c82b4d056d77659cc1d397e9dced36e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-french-ascii.ldf \
tex-datetime2-french-utf8.ldf \
tex-datetime2-french.ldf \
texlive-datetime2-french"

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
