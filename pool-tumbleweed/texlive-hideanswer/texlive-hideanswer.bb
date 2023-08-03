SUMMARY = "Generate documents with and without answers by toggling a switch"
DESCRIPTION = "This package can generate documents with and without answers \
from a single file by toggling a switch. However, it can only \
be used to create documents to be printed on paper."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn63852"

RPM_NAME = "texlive-hideanswer-2023.209.1.1svn63852-54.1.noarch.rpm"
RPM_HASH = "544f93b57b48980d469983d832c5e0389ae5aa5f836d7d41cd0cc5545faf14eefba562df31797b3f677614eaa16a97a66b3854e4343166771f892330a351c648"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hideanswer.sty \
texlive-hideanswer"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-graphicx.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
