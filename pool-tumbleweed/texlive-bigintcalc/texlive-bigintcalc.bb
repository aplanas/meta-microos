SUMMARY = "Integer calculations on very large numbers"
DESCRIPTION = "This package provides expandable arithmetic operations with big \
integers that can exceed TeX's number limits."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn53172"

RPM_NAME = "texlive-bigintcalc-2023.209.1.5svn53172-54.1.noarch.rpm"
RPM_HASH = "e035ab8176bc68e92261a47259a1d748cd303dad048b5fa68999ada625387024e120acc54284b12e42f0c66e3614052cbc280d5b581d3e01592f6a94a9c04c3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bigintcalc.sty \
texlive-bigintcalc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pdftexcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
