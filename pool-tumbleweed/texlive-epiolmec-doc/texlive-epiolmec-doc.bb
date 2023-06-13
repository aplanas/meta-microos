SUMMARY = "Documentation for texlive-epiolmec"
DESCRIPTION = "This package includes the documentation for texlive-epiolmec"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-epiolmec-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "8072b43ddcc51fb8eec373e0067151cbe3c046d60d9f852e5b7823d93e8429bafbce165f24476f87f09f8e5fbb1cdce6eca96003a848f1c30b40b20320588b91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epiolmec-doc"

RDEPENDS:${PN} += ""

inherit rpm
