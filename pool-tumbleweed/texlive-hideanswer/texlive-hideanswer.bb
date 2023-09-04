SUMMARY = "Generate documents with and without answers by toggling a switch"
DESCRIPTION = "This package can generate documents with and without answers \
from a single file by toggling a switch. However, it can only \
be used to create documents to be printed on paper."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn63852"

RPM_NAME = "texlive-hideanswer-2023.209.1.1svn63852-54.2.noarch.rpm"
RPM_HASH = "7136cf89d3a492ebc26097f8040b0af1364b2ec311ed467dd9e389871835043096a65df9d3c9107c76ef5be8524cc0c0f07121eff1205c1d1386ca2a15fccc6a"
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
