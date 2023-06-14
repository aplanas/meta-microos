SUMMARY = "Russian language module for the datetime2 package"
DESCRIPTION = "This module provides the 'russian' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn49345"

RPM_NAME = "texlive-datetime2-russian-2023.201.1.1svn49345-52.1.noarch.rpm"
RPM_HASH = "4482ba07a24b0bac6bf3ca22102442f3441efc0020f81a6e134a685cf9e04b16d1f44423161a29b00dcd95496d8f2b1a436cfc446e6f504f5700e9f3292a2c9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-russian-ascii.ldf \
tex-datetime2-russian-utf8.ldf \
tex-datetime2-russian.ldf \
texlive-datetime2-russian"

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
