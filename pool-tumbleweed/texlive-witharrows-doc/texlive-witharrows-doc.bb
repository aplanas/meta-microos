SUMMARY = "Documentation for texlive-witharrows"
DESCRIPTION = "This package includes the documentation for texlive-witharrows"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.8asvn65841"

RPM_NAME = "texlive-witharrows-doc-2023.201.2.8asvn65841-53.1.noarch.rpm"
RPM_HASH = "c7568e549b80d46e6247f83ca50de850b8718ff7ad7cfbda271335da60b1506c194a5cab6c8ac70c2226c99589f8de1ada64ffe84b5a22645b7a238a83cda1dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-witharrows-doc:fr) \
texlive-witharrows-doc"

RDEPENDS:${PN} += ""

inherit rpm
