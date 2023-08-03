SUMMARY = "Italian language module for the datetime2 package"
DESCRIPTION = "This module provides the 'italian' style that can be set using \
\\DTMsetstyle provided by datetime2.sty."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn37146"

RPM_NAME = "texlive-datetime2-italian-2023.209.1.3svn37146-53.1.noarch.rpm"
RPM_HASH = "3e2ffccd4f715edba616169068dc64c6c1b239052a7da32cc965a9b6176ebe80df8dce298d8c5321c6f2fb9697c4012677f7361c54cc6ea433e595178c0ae068"
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
