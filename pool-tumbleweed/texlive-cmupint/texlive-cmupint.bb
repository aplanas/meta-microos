SUMMARY = "Upright integral symbols for Computer Modern"
DESCRIPTION = "This package contains various upright integral symbols to match \
the Computer Modern font."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn54735"

RPM_NAME = "texlive-cmupint-2023.201.1.1svn54735-53.1.noarch.rpm"
RPM_HASH = "3ab83b7f43b993fad5c4dcda8196e6113062706fbd6fdc84b3c61b8ef33c984422fe5d016597e8dd12579afefbf428b28aed27ae36e0db657635df9fb26749c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cmupint.map) \
tex(cmupint.sty) \
tex(cmupint.tfm) \
tex(ucmupint.fd) \
texlive-cmupint"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(updmap.cfg) \
texlive \
texlive-cmupint-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
