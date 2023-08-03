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

RPM_NAME = "texlive-esint-2023.209.1.2dsvn52240-54.1.noarch.rpm"
RPM_HASH = "2916cee2d67445bbe94335007ccabab9f8d55c7e3286facf10179f91d82fc286947afd5a3664b6ba496034a1cb3dc347c919f7980dfa2606c213a9d1dfc184b9"
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
