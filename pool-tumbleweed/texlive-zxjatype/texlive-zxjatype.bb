SUMMARY = "Standard conforming typesetting of Japanese, for XeLaTeX"
DESCRIPTION = "The zxjatype package"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7svn53500"

RPM_NAME = "texlive-zxjatype-2023.201.0.0.7svn53500-52.2.noarch.rpm"
RPM_HASH = "d6dd57d2f62caf36c9ef13f1502d6a02fc260467829e89dbf5b9ba43fe7180ad8c18a234c06c6ae3b0b3496ac6ac509322fa86f67fcb6f2fbc38576523b7a782"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zxjatype.sty \
texlive-zxjatype"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-ifxetex.sty \
tex-xeCJK.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
