SUMMARY = "Galician language module for the datetime2 package"
DESCRIPTION = "This module provides the 'galician' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn47631"

RPM_NAME = "texlive-datetime2-galician-2023.201.1.0svn47631-52.1.noarch.rpm"
RPM_HASH = "da392393a686163b1b48e5317e50e80331bdc6f01add582a6df50e78fd16335185c69d4d6ca08a1d7bae3237a4194770137796ac6769c03f0a14c35be85a6f5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(datetime2-galician-ascii.ldf) \
tex(datetime2-galician-utf8.ldf) \
tex(datetime2-galician.ldf) \
texlive-datetime2-galician"

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
