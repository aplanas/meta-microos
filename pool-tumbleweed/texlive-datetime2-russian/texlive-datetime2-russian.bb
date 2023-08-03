SUMMARY = "Russian language module for the datetime2 package"
DESCRIPTION = "This module provides the 'russian' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn49345"

RPM_NAME = "texlive-datetime2-russian-2023.209.1.1svn49345-53.1.noarch.rpm"
RPM_HASH = "03682740ddfb990ccf7a1dfd3698801c8df02c6c36ee21be1a99c212492978f30a4e6c5c229fe54116e4cf97682e36ce0307fc339c6e0d9f12d00577396002fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-russian-ascii.ldf \
tex-datetime2-russian-utf8.ldf \
tex-datetime2-russian.ldf \
texlive-datetime2-russian"

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
