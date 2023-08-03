SUMMARY = "Upper Sorbian language module for the datetime2 package"
DESCRIPTION = "This module provides the 'usorbian' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn52375"

RPM_NAME = "texlive-datetime2-usorbian-2023.209.1.1svn52375-53.1.noarch.rpm"
RPM_HASH = "715f3ea471f335135d35d1597a5d5c895b68d6ed91d8d5701f4676d2d1823859e69bd148e4a0e0e833db217ea6dec45a3c0ac667da7fc3fb63a184bbffd14943"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-usorbian-ascii.ldf \
tex-datetime2-usorbian-utf8.ldf \
tex-datetime2-usorbian.ldf \
texlive-datetime2-usorbian"

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
