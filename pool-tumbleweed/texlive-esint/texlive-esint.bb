SUMMARY = "Extended set of integrals for Computer Modern"
DESCRIPTION = "The esint package permits access to alternate integral symbols \
when you are using the Computer Modern fonts. In the original \
set, several integral symbols are missing, such as \\oiint. Many \
of these symbols are available in other font sets (pxfonts, \
txfonts, etc.), but there is no good solution if you want to \
use Computer Modern. The package provides Metafont source and \
LaTeX macro support."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2dsvn52240"

RPM_NAME = "texlive-esint-2023.201.1.2dsvn52240-53.2.noarch.rpm"
RPM_HASH = "38f2fecfdc4371304721d2b22c5511e32b8f986be0568a32f97509ff7024d1139e98bb2c9cbd4be4735bc038655ccf585e94601dba29ace3c215afbf49e44bd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-esint.sty \
tex-esint10.tfm \
tex-uesint.fd \
texlive-esint"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
