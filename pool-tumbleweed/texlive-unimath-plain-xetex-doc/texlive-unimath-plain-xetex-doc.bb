SUMMARY = "Documentation for texlive-unimath-plain-xetex"
DESCRIPTION = "This package includes the documentation for texlive-unimath-plain-xetex"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2bsvn66394"

RPM_NAME = "texlive-unimath-plain-xetex-doc-2023.201.0.0.2bsvn66394-53.1.noarch.rpm"
RPM_HASH = "21883bbcf7b88c23e1879242544dd307be906188dd3b115cf9657226c2ec70848fbc426a4b7bb150ebda39145ae53a7edd5a9789d0f3aa983a03cc91a7d8d774"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unimath-plain-xetex-doc"

RDEPENDS:${PN} += ""

inherit rpm
