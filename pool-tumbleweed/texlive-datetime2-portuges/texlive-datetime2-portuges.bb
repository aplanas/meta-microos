SUMMARY = "Portuguese language module for the datetime2 package"
DESCRIPTION = "This module provides the 'portuges' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn48457"

RPM_NAME = "texlive-datetime2-portuges-2023.209.1.1svn48457-53.1.noarch.rpm"
RPM_HASH = "e38405bf7e259bbe22cb2a4c89a20a18c0f342c6841c08fd2636663c0ebc052ea18cbf9264b296c3ca804b053f36b6e546db21ba5e0edc1a72809b683406c379"
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
