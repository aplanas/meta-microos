SUMMARY = "Danish language module for the datetime2 package"
DESCRIPTION = "This module provides the 'danish' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn47034"

RPM_NAME = "texlive-datetime2-danish-2023.209.1.1svn47034-53.1.noarch.rpm"
RPM_HASH = "211704ec9bdcee094118f4b0e77e67f41b4bd1b48ece960f4a52a56a8e2ec3dbdbadae8d8fea80f4fa475affad89dbde7122065940a973280fb928c18ca767a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-danish-ascii.ldf \
tex-datetime2-danish-utf8.ldf \
tex-datetime2-danish.ldf \
texlive-datetime2-danish"

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
