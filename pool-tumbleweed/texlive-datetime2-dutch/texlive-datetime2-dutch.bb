SUMMARY = "Dutch language module for the datetime2 package"
DESCRIPTION = "This module provides the 'dutch' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn47355"

RPM_NAME = "texlive-datetime2-dutch-2023.209.1.1svn47355-53.1.noarch.rpm"
RPM_HASH = "c7f23a2d15f3e7fb552af1d99a066b83ff1fb678b252cc4888f39aa9011d62035c98490e9e592b8e605ef886675729313ecadbb1cae2e67e78c01f978b23c30a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-dutch.ldf \
texlive-datetime2-dutch"

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
