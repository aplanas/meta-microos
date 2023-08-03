SUMMARY = "Irish Gaelic Language Module for the datetime2 Package"
DESCRIPTION = "This module provides the 'irish' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn47632"

RPM_NAME = "texlive-datetime2-irish-2023.209.1.1svn47632-53.1.noarch.rpm"
RPM_HASH = "d8ce12a8978eba3389deb3f810c1e530c42ae34eb44578860c20f2c3232f4bef785e87cb1798a1b76fb4c213952fbc48f731b39308974511336340c6a01cafc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-ga-GB.ldf \
tex-datetime2-ga-IE.ldf \
tex-datetime2-irish-ascii.ldf \
tex-datetime2-irish-utf8.ldf \
tex-datetime2-irish.ldf \
texlive-datetime2-irish"

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
