SUMMARY = "Control ligatures in Serbian"
DESCRIPTION = "The package suppresses fi and fl (and other ligatures) in \
Serbian text written using Roman script."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn53127"

RPM_NAME = "texlive-serbian-lig-2023.209.svn53127-54.1.noarch.rpm"
RPM_HASH = "96493ad7fd85272b48d8b4e49cd6655deb19e48b57782a16d35facbc3b8413770a701fd4354d3542a2b7824c84c14bbe93782c2d96b18cbbe643839e89aa34ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-serbian-lig.sty \
texlive-serbian-lig"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
