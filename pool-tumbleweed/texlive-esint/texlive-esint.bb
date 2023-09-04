SUMMARY = "Extended set of integrals for Computer Modern"
DESCRIPTION = "The esint package permits access to alternate integral symbols \
when you are using the Computer Modern fonts. In the original \
set, several integral symbols are missing, such as \\oiint. Many \
of these symbols are available in other font sets (pxfonts, \
txfonts, etc.), but there is no good solution if you want to \
use Computer Modern. The package provides Metafont source and \
LaTeX macro support."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2dsvn52240"

RPM_NAME = "texlive-esint-2023.209.1.2dsvn52240-54.2.noarch.rpm"
RPM_HASH = "04a200842b52719a2dd073a842360e835d3f4b0ddc4fb3e844ff4f65a34ca32d8906468f0a7b954c84e196c8cbe8859b7880b55b586a6cc5019b06ed0a3be079"
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
