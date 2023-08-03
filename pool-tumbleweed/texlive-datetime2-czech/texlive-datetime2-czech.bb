SUMMARY = "Czech language module for the datetime2 package"
DESCRIPTION = "This module provides the 'czech' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn47033"

RPM_NAME = "texlive-datetime2-czech-2023.209.1.1svn47033-53.1.noarch.rpm"
RPM_HASH = "f9b00165037f1a84d691301e264a295e0b6a335970df546139b160772247bd50d4d9f568a488d0b469c92f3bcc92d6ba00a6bc4cebcbfbd5ccce1367c99bf4d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-czech-ascii.ldf \
tex-datetime2-czech-utf8.ldf \
tex-datetime2-czech.ldf \
texlive-datetime2-czech"

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
