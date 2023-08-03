SUMMARY = "Lower Sorbian language module for the datetime2 package"
DESCRIPTION = "This module provides the 'lsorbian' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn47749"

RPM_NAME = "texlive-datetime2-lsorbian-2023.209.1.1svn47749-53.1.noarch.rpm"
RPM_HASH = "fe05828c67544bc03f1c35f60429fd7f114713f7ef74d3da22a775c102637cd1ffe21a6014629c78bf6ba950500e406f28496c301e077a333263f7b12e81582c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-lsorbian-ascii.ldf \
tex-datetime2-lsorbian-utf8.ldf \
tex-datetime2-lsorbian.ldf \
texlive-datetime2-lsorbian"

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
