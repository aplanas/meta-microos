SUMMARY = "Irish Gaelic Language Module for the datetime2 Package"
DESCRIPTION = "This module provides the 'irish' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn47632"

RPM_NAME = "texlive-datetime2-irish-2023.201.1.1svn47632-52.1.noarch.rpm"
RPM_HASH = "890c837edeeb98f3b9c11df2b3a65da526e1859adf230397baa05440577a5053920e0b25a5b23a0fada6d6640ff241b106394fbb08f0a4fa1c8e68062f21c5ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(datetime2-ga-GB.ldf) \
tex(datetime2-ga-IE.ldf) \
tex(datetime2-irish-ascii.ldf) \
tex(datetime2-irish-utf8.ldf) \
tex(datetime2-irish.ldf) \
texlive-datetime2-irish"

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
