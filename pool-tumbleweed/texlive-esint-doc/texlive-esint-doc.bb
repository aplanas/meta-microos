SUMMARY = "Documentation for texlive-esint"
DESCRIPTION = "This package includes the documentation for texlive-esint"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2dsvn52240"

RPM_NAME = "texlive-esint-doc-2023.209.1.2dsvn52240-54.1.noarch.rpm"
RPM_HASH = "f4716b23444d1b9834dfcfa6310e849cca134137e7afb888d052248c5f73e34358af6c140d8901d1b48173133c397ab6eb42bccf8f50cc259950b3dcbc24d9d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esint-doc"

RDEPENDS:${PN} += ""

inherit rpm
