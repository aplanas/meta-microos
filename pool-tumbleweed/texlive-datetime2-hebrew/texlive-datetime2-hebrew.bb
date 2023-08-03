SUMMARY = "Hebrew language module for the datetime2 package"
DESCRIPTION = "This module provides the 'hebrew' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn47534"

RPM_NAME = "texlive-datetime2-hebrew-2023.209.1.1svn47534-53.1.noarch.rpm"
RPM_HASH = "54683b301af215a2bbec4a824285c1fb5bfa0e995b1002428ba94187e6464c94d59e0e0b5f8bc67536a1f58fbbc13428eba190deea3c8d659769c0dfedbe988b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-hebrew.ldf \
texlive-datetime2-hebrew"

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
