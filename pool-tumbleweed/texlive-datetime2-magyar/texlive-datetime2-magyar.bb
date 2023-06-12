SUMMARY = "Magyar language module for the datetime2 package"
DESCRIPTION = "This module provides the 'magyar' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn48266"

RPM_NAME = "texlive-datetime2-magyar-2023.201.1.1svn48266-52.1.noarch.rpm"
RPM_HASH = "1eee8cb4e891709df6c989824cc016e738be1f437a5e1d9faed27837df28cf05b19dfec8c7c39db223fc200c336db9c97d5266570012df974222464420584ade"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(datetime2-magyar-ascii.ldf) \
tex(datetime2-magyar-utf8.ldf) \
tex(datetime2-magyar.ldf) \
texlive-datetime2-magyar"
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
