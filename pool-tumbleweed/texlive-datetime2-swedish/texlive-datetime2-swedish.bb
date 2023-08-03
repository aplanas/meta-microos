SUMMARY = "Swedish language module for the datetime2 package"
DESCRIPTION = "This module provides the 'swedish' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn36700"

RPM_NAME = "texlive-datetime2-swedish-2023.209.1.0svn36700-53.1.noarch.rpm"
RPM_HASH = "98dcef3309e4321ec4da8aebb2615b9477293900b69f1c6e0c1ad73a0a4931addc31bddc3a9aea77ee820344ae7f62946923c91868e53aabf6b926d199308fd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-swedish-ascii.ldf \
tex-datetime2-swedish-utf8.ldf \
tex-datetime2-swedish.ldf \
texlive-datetime2-swedish"

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
