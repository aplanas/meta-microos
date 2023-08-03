SUMMARY = "Welsh language module for the datetime2 package"
DESCRIPTION = "This module provides the 'welsh' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn52553"

RPM_NAME = "texlive-datetime2-welsh-2023.209.1.1svn52553-53.1.noarch.rpm"
RPM_HASH = "ccc261f3779a5bc76ed84063b745ccc745c8ba340f636978dc889d784b9b3f9138becda7743c08c1ffebff0a391a510f4126e71c5e59d5c5e8b52cd2e27f7ddf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-welsh-ascii.ldf \
tex-datetime2-welsh-utf8.ldf \
tex-datetime2-welsh.ldf \
texlive-datetime2-welsh"

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
