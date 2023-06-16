SUMMARY = "Spanish language module for the datetime2 package"
DESCRIPTION = "This module provides the 'spanish' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn45785"

RPM_NAME = "texlive-datetime2-spanish-2023.201.1.1svn45785-52.1.noarch.rpm"
RPM_HASH = "0559211c32a4811da7d675e2bb4cf1056f55aa5c4a02f2f79adf636e8db439427ff9ef504ca838ace2edbdcc2b9293bd9fa101fc6b977833cae61c87105eb68f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-spanish-ascii.ldf \
tex-datetime2-spanish-utf8.ldf \
tex-datetime2-spanish.ldf \
texlive-datetime2-spanish"

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
