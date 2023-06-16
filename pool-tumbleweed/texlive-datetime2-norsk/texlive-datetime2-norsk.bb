SUMMARY = "Norsk language module for the datetime2 package"
DESCRIPTION = "This module provides the 'norsk' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn48267"

RPM_NAME = "texlive-datetime2-norsk-2023.201.1.1svn48267-52.1.noarch.rpm"
RPM_HASH = "d6a707acd259a4518b6cbc02419136378d93f864b496f78330c1d44046eb0671538f2f21f7e34ae77112985f77c7868ede8674a85de1479eff88ac037ab10b9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-norsk-ascii.ldf \
tex-datetime2-norsk-utf8.ldf \
tex-datetime2-norsk.ldf \
texlive-datetime2-norsk"

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
