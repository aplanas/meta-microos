SUMMARY = "Generate documents with and without answers by toggling a switch"
DESCRIPTION = "This package can generate documents with and without answers \
from a single file by toggling a switch. However, it can only \
be used to create documents to be printed on paper."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn63852"

RPM_NAME = "texlive-hideanswer-2023.201.1.1svn63852-53.1.noarch.rpm"
RPM_HASH = "904fbcf96b030b24d917ceab4c19148103804e12a99185fbb17c04ec487be522a6688ebc43ef3297274ae915ed3725387d242100a53c06bc79c22785141d5241"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hideanswer.sty) \
texlive-hideanswer"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(color.sty) \
tex(graphicx.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
