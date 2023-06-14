SUMMARY = "Lower Sorbian language module for the datetime2 package"
DESCRIPTION = "This module provides the 'lsorbian' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn47749"

RPM_NAME = "texlive-datetime2-lsorbian-2023.201.1.1svn47749-52.1.noarch.rpm"
RPM_HASH = "3b99a7c248b90dc860fe7585c1edd9d2061f3c4fbccd3b11d9bb58001377d4dc88ddae8483d243b94a41d30010a313274988053a1649b63c3c024c52c46330db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-lsorbian-ascii.ldf \
tex-datetime2-lsorbian-utf8.ldf \
tex-datetime2-lsorbian.ldf \
texlive-datetime2-lsorbian"

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
