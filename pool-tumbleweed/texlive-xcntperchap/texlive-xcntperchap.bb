SUMMARY = "Track the number of subsections etc. that occur in a specified tracklevel"
DESCRIPTION = "This package is the successor of cntperchap and allows to \
provide more tracklevels than just only one."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn54080"

RPM_NAME = "texlive-xcntperchap-2023.209.0.0.5svn54080-53.1.noarch.rpm"
RPM_HASH = "638808c75b9fd723f1582e4c72ab16cdd02ff03abdcc66d4ec110c4be98f04ea332f234df751109ec4793c3aa5f45896353287de5b4951162f9f6a271b2ab2a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xcntperchap.sty \
texlive-xcntperchap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
tex-xassoccnt.sty \
tex-xparse.sty \
tex-zref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
