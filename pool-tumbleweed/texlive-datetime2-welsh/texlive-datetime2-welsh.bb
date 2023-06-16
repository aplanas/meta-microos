SUMMARY = "Welsh language module for the datetime2 package"
DESCRIPTION = "This module provides the 'welsh' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn52553"

RPM_NAME = "texlive-datetime2-welsh-2023.201.1.1svn52553-52.1.noarch.rpm"
RPM_HASH = "3dccf73c48406b84cdff86cf30f39b7bea3df8e3cec9d0d2752b78a1d70841f294f7a8e16e25a450313963b6ce352dde803df1ca999bfdfc932236e8f57edd5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-welsh-ascii.ldf \
tex-datetime2-welsh-utf8.ldf \
tex-datetime2-welsh.ldf \
texlive-datetime2-welsh"

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
