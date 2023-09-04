SUMMARY = "Track the number of subsections etc. that occur in a specified tracklevel"
DESCRIPTION = "This package is the successor of cntperchap and allows to \
provide more tracklevels than just only one."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn54080"

RPM_NAME = "texlive-xcntperchap-2023.209.0.0.5svn54080-53.2.noarch.rpm"
RPM_HASH = "e74970efb477cc9b5bd39d7fb6241b3cee036c8c85d41ef1a175b6632473b994d7124b71db295a4d7bfc854f2a67cda19b5801591fdb503e2477e0b68c3b8cb0"
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
