SUMMARY = "Portuguese language module for the datetime2 package"
DESCRIPTION = "This module provides the 'portuges' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn48457"

RPM_NAME = "texlive-datetime2-portuges-2023.201.1.1svn48457-52.1.noarch.rpm"
RPM_HASH = "e1eb08585772e162257d586f3f3c5a3a634e65502b5832e52989ca75e3f82585e20039ef2be1d19257f37d5a38fd5e0a096e4909643087741449e2245f69bf75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-portuges-ascii.ldf \
tex-datetime2-portuges-utf8.ldf \
tex-datetime2-portuges.ldf \
texlive-datetime2-portuges"

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
