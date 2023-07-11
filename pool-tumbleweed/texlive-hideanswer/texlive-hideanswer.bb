SUMMARY = "Generate documents with and without answers by toggling a switch"
DESCRIPTION = "This package can generate documents with and without answers \
from a single file by toggling a switch. However, it can only \
be used to create documents to be printed on paper."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn63852"

RPM_NAME = "texlive-hideanswer-2023.201.1.1svn63852-53.2.noarch.rpm"
RPM_HASH = "0cf460861a1374ca2d431265a72f7f1cfaf137fcf25ff27f136db26157d896747203e55e36766ed79054055895c9c74182c5a68c9c07be07aeb2ad434578c7c3"
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
