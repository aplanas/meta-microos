SUMMARY = "Greek language module for the datetime2 package"
DESCRIPTION = "This module provides the 'greek' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn47533"

RPM_NAME = "texlive-datetime2-greek-2023.201.1.1svn47533-52.1.noarch.rpm"
RPM_HASH = "42cac264a9ca42649f519d6fdbb2ca553607f32c318bca7de4627ba546a6323f6cad7706662c034bbe0c960a129366d101c7790af68b00a840dd64474a3b43ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(datetime2-greek-ascii.ldf) \
tex(datetime2-greek-utf8.ldf) \
tex(datetime2-greek.ldf) \
texlive-datetime2-greek"
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
