SUMMARY = "Swedish language module for the datetime2 package"
DESCRIPTION = "This module provides the 'swedish' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn36700"

RPM_NAME = "texlive-datetime2-swedish-2023.201.1.0svn36700-52.1.noarch.rpm"
RPM_HASH = "bb34bd4dc2b81d0fe1037a8e9d9c25e62e49597b680e7141d4975790577b5d59a02514975835101d6efbf54fe2e9d389a6e185b57d345501334438547d880ea8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(datetime2-swedish-ascii.ldf) \
tex(datetime2-swedish-utf8.ldf) \
tex(datetime2-swedish.ldf) \
texlive-datetime2-swedish"

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
