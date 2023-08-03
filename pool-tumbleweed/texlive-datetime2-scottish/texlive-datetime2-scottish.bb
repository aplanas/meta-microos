SUMMARY = "Scottish Gaelic Language Module for the datetime2 Package"
DESCRIPTION = "This module provides the 'scottish' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn52101"

RPM_NAME = "texlive-datetime2-scottish-2023.209.1.1svn52101-53.1.noarch.rpm"
RPM_HASH = "b2c75705b6640b6a69f9f6116e45887024270a480ccc0542560b77f6e92b4f556c30a683220d568849f4e657cba8d9ee4802ef7aec9eb52cf51794018a8667c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-scottish-ascii.ldf \
tex-datetime2-scottish-utf8.ldf \
tex-datetime2-scottish.ldf \
texlive-datetime2-scottish"

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
