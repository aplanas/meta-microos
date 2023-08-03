SUMMARY = "Norsk language module for the datetime2 package"
DESCRIPTION = "This module provides the 'norsk' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn48267"

RPM_NAME = "texlive-datetime2-norsk-2023.209.1.1svn48267-53.1.noarch.rpm"
RPM_HASH = "cc613112323821abdcccdf3814b281a5e80ae85ffd51bfe7473644a401d7021e7703a5ab8e04849f31134175d3a16c532eaaa02dd3a288030e2faba22c14402d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-norsk-ascii.ldf \
tex-datetime2-norsk-utf8.ldf \
tex-datetime2-norsk.ldf \
texlive-datetime2-norsk"

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
