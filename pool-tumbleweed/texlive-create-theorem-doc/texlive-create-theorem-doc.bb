SUMMARY = "Documentation for texlive-create-theorem"
DESCRIPTION = "This package includes the documentation for texlive-create-theorem"
LICENSE = "LPPL-1.0"

PV = "2023.204.20220808asvn64104"

RPM_NAME = "texlive-create-theorem-doc-2023.204.20220808asvn64104-54.1.noarch.rpm"
RPM_HASH = "3c06eb80333d130215aca0135c6aed1e4605f989a5bdf63457744d45e4ccf383f3310202f74c722a9f8f78bf064bd9c2536fcd3c6de6dfc01d9a6c61e771f7d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-create-theorem-doc"

RDEPENDS:${PN} += ""

inherit rpm
