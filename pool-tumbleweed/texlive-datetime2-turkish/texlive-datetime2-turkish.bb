SUMMARY = "Turkish language module for the datetime2 package"
DESCRIPTION = "This module provides the 'turkish' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn52331"

RPM_NAME = "texlive-datetime2-turkish-2023.209.1.1svn52331-53.1.noarch.rpm"
RPM_HASH = "ade0fd797b74027879fc1df631ffb29dccee49a25a024b4e787e394dbb90ae95a979f64e6467e4d5c54b16fae78f40dd53cb9709c89686e7898cef91dc9df8c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-turkish-ascii.ldf \
tex-datetime2-turkish-utf8.ldf \
tex-datetime2-turkish.ldf \
texlive-datetime2-turkish"

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
