SUMMARY = "Estonian language module for the datetime2 package"
DESCRIPTION = "This module provides the 'estonian' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn47565"

RPM_NAME = "texlive-datetime2-estonian-2023.209.1.1svn47565-53.1.noarch.rpm"
RPM_HASH = "8bca24cde6f3ea8783d14cfde403dcabb4df7c6624f782b633aae5e2d9a15a5ac8cef084c1ed929dbc16a45b3ceddda9b428df01885985f372ad943772384b60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-estonian-ascii.ldf \
tex-datetime2-estonian-utf8.ldf \
tex-datetime2-estonian.ldf \
texlive-datetime2-estonian"

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
