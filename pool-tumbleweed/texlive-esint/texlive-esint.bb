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

RPM_NAME = "texlive-esint-2023.201.1.2dsvn52240-53.1.noarch.rpm"
RPM_HASH = "f354556711097d5baf758bffa6fcf015e0d6777b60627a20ed8d5988374faaa1f7987d570d821e07d143bb301a955c17530db36a150497ccbf4077dcbc6bb401"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(esint.sty) \
tex(esint10.tfm) \
tex(uesint.fd) \
texlive-esint"
RDEPENDS:${PN} += "/bin/sh \
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
