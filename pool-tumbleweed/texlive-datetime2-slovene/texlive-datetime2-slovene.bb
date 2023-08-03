SUMMARY = "Slovene language module for the datetime2 package"
DESCRIPTION = "This module provides the 'slovene' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn52282"

RPM_NAME = "texlive-datetime2-slovene-2023.209.1.1svn52282-53.1.noarch.rpm"
RPM_HASH = "e1de4750d4b7e26b62d24f29257e71d90d1a32389c9ed37823931c2c67f388133a6e4b264b26747435e415a24814538bcb34418caa44620552d0c735de76d5d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-slovene-ascii.ldf \
tex-datetime2-slovene-utf8.ldf \
tex-datetime2-slovene.ldf \
texlive-datetime2-slovene"

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
