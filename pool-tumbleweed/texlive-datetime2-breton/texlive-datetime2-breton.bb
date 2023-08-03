SUMMARY = "Breton language module for the datetime2 package"
DESCRIPTION = "This module provides the 'breton' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn52647"

RPM_NAME = "texlive-datetime2-breton-2023.209.1.2svn52647-53.1.noarch.rpm"
RPM_HASH = "3fab246806277ac09796fe047bade39844b8fb9ba14bfd9cfb84f56b6c1fac1ef83d726469331d1005e1bae58736d33c197d93c09a9d3c97b29eb78e91e31c61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-breton-ascii.ldf \
tex-datetime2-breton-utf8.ldf \
tex-datetime2-breton.ldf \
texlive-datetime2-breton"

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
