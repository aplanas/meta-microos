SUMMARY = "Magyar language module for the datetime2 package"
DESCRIPTION = "This module provides the 'magyar' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn48266"

RPM_NAME = "texlive-datetime2-magyar-2023.209.1.1svn48266-53.1.noarch.rpm"
RPM_HASH = "8767975f7e441c88c71dfc4b9c7872c780fd22c4ea3c07161c07c264dafcb87f89c0418620b89be8ab098748cceadb12b99a725f426a387944654465bdcb0bfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-magyar-ascii.ldf \
tex-datetime2-magyar-utf8.ldf \
tex-datetime2-magyar.ldf \
texlive-datetime2-magyar"

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
