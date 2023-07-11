SUMMARY = "Track the number of subsections etc. that occur in a specified tracklevel"
DESCRIPTION = "This package is the successor of cntperchap and allows to \
provide more tracklevels than just only one."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn54080"

RPM_NAME = "texlive-xcntperchap-2023.201.0.0.5svn54080-52.2.noarch.rpm"
RPM_HASH = "b65f4cb92e72728c069c0d11e187cec595b0dfd72ec681a514f28cabae2fb3a766b153461c62fec1e84480c82cbd898d68240292574a5cd959e3e5559a3ba0a7"
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
