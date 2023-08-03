SUMMARY = "Documentation for texlive-ccaption"
DESCRIPTION = "This package includes the documentation for texlive-ccaption"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.2csvn23443"

RPM_NAME = "texlive-ccaption-doc-2023.209.3.2csvn23443-53.1.noarch.rpm"
RPM_HASH = "9a02b1157a1e73a715cd3b6f4d5eb82ff0fb9f8e2a309fa9755dd5b4998b318428384fd295851360e1c9ad9e3219a863742b551a8809b82611fc2b3906049b1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ccaption-doc"

RDEPENDS:${PN} += ""

inherit rpm
