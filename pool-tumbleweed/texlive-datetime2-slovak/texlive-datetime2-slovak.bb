SUMMARY = "Slovak language module for the datetime2 package"
DESCRIPTION = "This module provides the 'slovak' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn52281"

RPM_NAME = "texlive-datetime2-slovak-2023.201.1.1svn52281-52.1.noarch.rpm"
RPM_HASH = "03b7e9ef98a5a5c51cc66788e5357be373baa2b51bcf6514c34430ee6ae1b61beb4d513bd43429db6b173e7416c18e1c9dfb57610c5e118634d0809e3ecca547"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(datetime2-slovak-ascii.ldf) \
tex(datetime2-slovak-utf8.ldf) \
tex(datetime2-slovak.ldf) \
texlive-datetime2-slovak"
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
