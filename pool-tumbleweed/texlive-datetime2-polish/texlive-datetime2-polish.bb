SUMMARY = "Polish language module for the datetime2 package"
DESCRIPTION = "This module provides the 'polish' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn48456"

RPM_NAME = "texlive-datetime2-polish-2023.209.1.1svn48456-53.1.noarch.rpm"
RPM_HASH = "4a3c3818169c2a80f205b7051eb5505acf7c0244fe78318c5fc0af1bb2658bfeab41bc693ca545f9378d51a007655f6a3ecea422029ced23fbdf12c42cf52da9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-polish-ascii.ldf \
tex-datetime2-polish-utf8.ldf \
tex-datetime2-polish.ldf \
texlive-datetime2-polish"

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
