SUMMARY = "Northern Sami language module for the datetime2 package"
DESCRIPTION = "This module provides the 'samin' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn49346"

RPM_NAME = "texlive-datetime2-samin-2023.201.1.1svn49346-52.1.noarch.rpm"
RPM_HASH = "9ff766d153cc58b8d45ce83cbf686d7c2043297c8b3ad9367f822abf17cd60f33b8c7b28354d53e6e899ab8f20f10dbb8dca2f4032fd85d62ccb30d04f8fabb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(datetime2-samin-ascii.ldf) \
tex(datetime2-samin-utf8.ldf) \
tex(datetime2-samin.ldf) \
texlive-datetime2-samin"

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
