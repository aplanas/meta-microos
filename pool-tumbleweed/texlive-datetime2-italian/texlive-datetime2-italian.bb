SUMMARY = "Italian language module for the datetime2 package"
DESCRIPTION = "This module provides the 'italian' style that can be set using \
\\DTMsetstyle provided by datetime2.sty."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn37146"

RPM_NAME = "texlive-datetime2-italian-2023.201.1.3svn37146-52.1.noarch.rpm"
RPM_HASH = "43885e81c9f6673fe10f4ab0784a1beaac2ecec509cf12666cfdfa5694a7772684681cf3f79357b701292c37e5ee4a5c48bee24f7983de23d834cb40b8573602"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-italian-ascii.ldf \
tex-datetime2-italian-utf8.ldf \
tex-datetime2-italian.ldf \
texlive-datetime2-italian"

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
