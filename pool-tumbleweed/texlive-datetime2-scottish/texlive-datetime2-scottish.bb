SUMMARY = "Scottish Gaelic Language Module for the datetime2 Package"
DESCRIPTION = "This module provides the 'scottish' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn52101"

RPM_NAME = "texlive-datetime2-scottish-2023.201.1.1svn52101-52.1.noarch.rpm"
RPM_HASH = "11ef44efe0e9bd00c9baad2f4c51ac163e77f1b2b2ef39e691ce1f2bed870e3e571c42ccd9eec12fd150ca17ed018bc51692c3451143b026810a48abf5429c56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-scottish-ascii.ldf \
tex-datetime2-scottish-utf8.ldf \
tex-datetime2-scottish.ldf \
texlive-datetime2-scottish"

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
