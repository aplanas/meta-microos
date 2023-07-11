SUMMARY = "Documentation for texlive-pxtatescale"
DESCRIPTION = "This package includes the documentation for texlive-pxtatescale"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn63967"

RPM_NAME = "texlive-pxtatescale-doc-2023.201.0.0.4svn63967-53.2.noarch.rpm"
RPM_HASH = "150ee7032c42046dd78501e3aa1ecd33fe72a1519acff12cb196b92154cbc664c9dca9c137d9894e8242a095b9f901f0e3896a1684791676267eb61b83821f17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxtatescale-doc"

RDEPENDS:${PN} += ""

inherit rpm
