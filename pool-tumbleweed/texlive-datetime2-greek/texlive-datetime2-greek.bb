SUMMARY = "Greek language module for the datetime2 package"
DESCRIPTION = "This module provides the 'greek' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn47533"

RPM_NAME = "texlive-datetime2-greek-2023.209.1.1svn47533-53.1.noarch.rpm"
RPM_HASH = "5991707db9d0aaac812eea30593aa45433e377d9fad3782408d121438269e6524721ef9f3a9cbbe0e80dd56a9493aa7e92c7ac182effeb303a932a126cf8c4c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-greek-ascii.ldf \
tex-datetime2-greek-utf8.ldf \
tex-datetime2-greek.ldf \
texlive-datetime2-greek"

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
