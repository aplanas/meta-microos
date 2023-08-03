SUMMARY = "Croatian language module for the datetime2 package"
DESCRIPTION = "This module provides the 'croatian' style that can be set using \
\\DTMsetstyle provided by datetime2.sty."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn36682"

RPM_NAME = "texlive-datetime2-croatian-2023.209.1.0svn36682-53.1.noarch.rpm"
RPM_HASH = "ed67962a35ae59d6738f70c83010d3b35b4eaa1782fe739a4c6c9e77e892bd41ef80bf1525ead4131703e9cecb526b0b1ac39dc6ea5ff3fb5d3954b528ce4fe6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-croatian-ascii.ldf \
tex-datetime2-croatian-utf8.ldf \
tex-datetime2-croatian.ldf \
texlive-datetime2-croatian"

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
