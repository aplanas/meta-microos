SUMMARY = "Documentation for texlive-hanging"
DESCRIPTION = "This package includes the documentation for texlive-hanging"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2bsvn15878"

RPM_NAME = "texlive-hanging-doc-2023.209.1.2bsvn15878-54.2.noarch.rpm"
RPM_HASH = "88c435001a1480f0c1f688ad93809596dfc85272e6ce8d9e3e10a11ad2635d87fde610dc682f3584b26d8ff0e3e5b41a102f08fcf8421d5b3b87487cf49cd2f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hanging-doc"

RDEPENDS:${PN} += ""

inherit rpm
